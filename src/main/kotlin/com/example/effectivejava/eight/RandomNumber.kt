package com.example.effectivejava.eight

import java.util.Random
import kotlin.math.abs

class RandomNumber {

    companion object {

        private val rnd = Random()

        fun random(n: Int) = abs(rnd.nextInt()) % n

    }

}