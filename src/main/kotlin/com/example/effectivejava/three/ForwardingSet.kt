package com.example.effectivejava.three

open class ForwardingSet<E>(private val mutableSet: MutableSet<E>) : MutableSet<E> {

    override val size: Int = 0

    override fun clear() {
        mutableSet.clear()
    }

    override fun isEmpty() = mutableSet.isEmpty()

    override fun containsAll(elements: Collection<E>) = mutableSet.containsAll(elements)

    override fun contains(element: E) = mutableSet.contains(element)

    override fun iterator(): MutableIterator<E> = mutableSet.iterator()

    override fun retainAll(elements: Collection<E>): Boolean = mutableSet.retainAll(elements.toSet())

    override fun removeAll(elements: Collection<E>): Boolean = mutableSet.removeAll(elements.toSet())

    override fun remove(element: E): Boolean = mutableSet.remove(element)

    override fun addAll(elements: Collection<E>): Boolean = mutableSet.addAll(elements)

    override fun add(element: E): Boolean = mutableSet.add(element)

}