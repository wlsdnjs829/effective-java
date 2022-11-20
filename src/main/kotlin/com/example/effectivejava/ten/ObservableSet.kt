package com.example.effectivejava.ten

import com.example.effectivejava.three.ForwardingSet
import java.util.concurrent.CopyOnWriteArrayList
import java.util.concurrent.ExecutionException
import java.util.concurrent.Executors

class ObservableSet<E>(mutableSet: MutableSet<E>) : ForwardingSet<E>(mutableSet) {

    private val observers: MutableList<SetObserver<E>> = CopyOnWriteArrayList()

    fun addObserver(observer: SetObserver<E>) {
        synchronized(observers) {
            observers.add(observer)
        }
    }

    fun removeObserver(observer: SetObserver<E>) {
        synchronized(observers) {
            observers.remove(observer)
        }
    }

    private fun notifyElementAdded(element: E) {
        for (observer in observers) {
            observer.added(this, element)
        }
    }

    override fun add(element: E): Boolean {
        val added = super.add(element)

        if (added) {
            notifyElementAdded(element)
        }

        return added
    }

    override fun addAll(elements: Collection<E>): Boolean {
        var result = false

        for (element in elements) {
            result = result or add(element)
        }

        return result
    }

}

fun main() {
    val set = ObservableSet<Int>(hashSetOf())

    set.addObserver(object : SetObserver<Int> {
        override fun added(set: ObservableSet<Int>, element: Int) {
            println(element)

            if (element == 23) {
                val executor = Executors.newSingleThreadExecutor()

                try {
                    executor.submit { set.removeObserver(this) }
                        .get()
                } catch (ex: ExecutionException) {
                    throw AssertionError(ex)
                } catch (ex: InterruptedException) {
                    throw AssertionError(ex)
                } finally {
                    executor.shutdown()
                }
            }
        }
    })

    (0 until 100).forEach {
        set.add(it)
    }
}