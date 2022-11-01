package com.example.effectivejava.three

import java.time.Instant

class Sub : Super() {

    var instant: Instant = Instant.now()

    override fun overrideMe() {
        println(instant)
    }

    fun main() {
        val sub = Sub()
        sub.overrideMe()
    }

}

