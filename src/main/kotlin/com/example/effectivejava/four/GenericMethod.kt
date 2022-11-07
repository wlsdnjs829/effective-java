package com.example.effectivejava.four

import com.example.effectivejava.four.GenericMethod.Companion.pickTwo
import java.util.concurrent.ThreadLocalRandom

class GenericMethod {

    companion object {
        fun <E> union(s1: Set<E>, s2: Set<E>) : Set<E> {
            val result = HashSet(s1)
            result.addAll(s2)
            return result
        }

        fun <T> toArray(vararg args: T) = args

        inline fun <reified T> pickTwo(a: T, b: T, c: T): Array<out T> {
            return when (ThreadLocalRandom.current().nextInt(3)) {
                0 -> toArray(a, b)
                1 -> toArray(a, c)
                2 -> toArray(b, c)
                else -> emptyArray()
            }
        }

    }

}