package com.example.effectivejava.three

class InstrumentedSet<E> : ForwardingSet<E> {

    var addCount = 0
        private set

    constructor(mutableSet: MutableSet<E>) : super(mutableSet)

    override fun add(element: E): Boolean {
        addCount++
        return super.add(element)
    }

    override fun addAll(elements: Collection<E>): Boolean {
        addCount += elements.size
        return super.addAll(elements)
    }

}