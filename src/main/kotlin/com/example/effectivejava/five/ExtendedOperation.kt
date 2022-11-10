package com.example.effectivejava.five

import kotlin.math.pow

enum class ExtendedOperation(
    private val symbol: String,
) : Operation {

    EXP("^") {
        override fun apply(x: Double, y: Double) = x.pow(y)
    },
    REMAINDER("%") {
        override fun apply(x: Double, y: Double) = x % y
    },
    ;

}