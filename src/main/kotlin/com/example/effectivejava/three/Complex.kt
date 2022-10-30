package com.example.effectivejava.three

class Complex private constructor(
    private val re: Double,
    private val im: Double,
) {

    companion object {
        fun valueOf(re: Double, im: Double) = Complex(re, im)
    }

}