package com.example.effectivejava.five

import java.util.function.DoubleBinaryOperator

enum class BasicOperation(
    private val symbol: String,
    private val op: DoubleBinaryOperator,
) {

    PLUS("+", { x, y -> x + y }),
    MINUS("-", { x, y -> x - y }),
    TIMES("*", { x, y -> x * y }),
    DIVIDE("/", { x, y -> x / y }),
    ;

    fun apply(x: Double, y: Double): Double = op.applyAsDouble(x, y)

}