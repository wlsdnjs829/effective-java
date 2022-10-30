package com.example.effectivejava.three

open class ForwardingSet<E>(private val mutableSet: MutableSet<E>) : MutableSet<E> by mutableSet {

    override val size: Int = 0

}