package com.example.effectivejava.three

open class Super {

    init {
        this.overrideMe()
    }

    open fun overrideMe() = Unit

}