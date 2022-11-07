package com.example.effectivejava.four

class GenericMethod {

    companion object {
        fun <E> union(s1: Set<E>, s2: Set<E>) : Set<E> {
            val result = HashSet(s1)
            result.addAll(s2)
            return result
        }
    }

}