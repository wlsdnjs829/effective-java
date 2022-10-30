package com.example.effectivejava.three

class InstrumentedHashSet<E> : HashSet<E> {

    var addCount = 0
        private set

    constructor(initCap: Int, loadFactory: Float) : super(initCap, loadFactory)

    override fun add(element: E): Boolean {
        addCount++
        return super.add(element)
    }

    override fun addAll(elements: Collection<E>): Boolean {
        addCount += elements.size
        return super.addAll(elements)
    }

}