package com.example.effectivejava.three

class Rectangle(
    private val length: Double,
    private val width: Double,
) : FigureRefactor() {

    override fun area(): Double = length * width

}