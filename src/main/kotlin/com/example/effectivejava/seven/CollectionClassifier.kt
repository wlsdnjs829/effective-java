package com.example.effectivejava.seven

import java.math.BigInteger

class CollectionClassifier {

    companion object {

        fun classify(c: Collection<*>): String =
            when (c) {
                is Set -> "집합"
                is List -> "리스트"
                else -> "그 외"
            }

    }

    fun main() {
        val collections =
            arrayOf(HashSet<String>(), ArrayList<BigInteger>(), HashMap<String, String>().values)

        for (c in collections) {
            println(classify(c))
        }
    }

}