package com.example.effectivejava.five

enum class Planet(
    private val mass: Double, private val radius: Double,
) {

    MERCURY(3.302e+23, 2.439e6),
    VENUS(4.869e+24, 6.052e6),
    EARTH(5.975e+24, 6.378e6),
    MARS(6.419e+23, 3.393e6),
    ;

    private val surfaceGravity: Double

    private object Const {
        const val G = 6.67300E-11
    }

    init {
        this.surfaceGravity = Const.G * mass / (radius * radius)
    }

    fun surfaceWeight(mass: Double) = mass * surfaceGravity

}

