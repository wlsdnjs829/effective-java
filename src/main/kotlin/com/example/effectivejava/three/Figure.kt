package com.example.effectivejava.three

class Figure {

    enum class Shape {
        RECTANGLE,
        CIRCLE;
    }

    private val shape: Shape

    // 다음 필드들은 모양이 사각형일 때만 쓰인다.
    private var length: Double = 0.0
    private var width: Double = 0.0

    // 다음 필드는 모양이 원일 때만 쓰인다.
    private var radius: Double = 0.0

    constructor(radius: Double) {
        shape = Shape.CIRCLE
        this.radius = radius
    }

    constructor(length: Double, width: Double) {
        shape = Shape.RECTANGLE
        this.length = length
        this.width = width
    }

    fun area(): Double =
        when(shape) {
            Shape.RECTANGLE -> length * width
            Shape.CIRCLE -> Math.PI * (radius * radius)
            else -> throw AssertionError(shape)
        }

}