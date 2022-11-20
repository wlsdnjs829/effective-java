package com.example.effectivejava.ten

fun interface SetObserver<E> {

    fun added(set: ObservableSet<E>, element: E)

}