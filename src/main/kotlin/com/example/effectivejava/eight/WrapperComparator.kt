package com.example.effectivejava.eight

class WrapperComparator {

    companion object {

        val naturalOrder = Comparator<Int> { i, j ->
            when {
                i < j -> -1
                i == j -> 0
                else -> 1
            }
        }

    }

}