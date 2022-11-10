package com.example.effectivejava.five

enum class BasicOperation(
    private val symbol: String,
) : Operation {

    PLUS("+") {
        override fun apply(x: Double, y: Double) = x + y
    },
    MINUS("-") {
        override fun apply(x: Double, y: Double) = x - y
    },
    TIMES("*") {
        override fun apply(x: Double, y: Double) = x * y
    },
    DIVIDE("/") {
        override fun apply(x: Double, y: Double) = x / y
    },
    ;

}