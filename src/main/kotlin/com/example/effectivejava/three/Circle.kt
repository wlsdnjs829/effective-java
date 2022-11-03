package com.example.effectivejava.three

class Circle(private val radius: Double) : FigureRefactor() {

    override fun area(): Double = Math.PI * (radius * radius)

}