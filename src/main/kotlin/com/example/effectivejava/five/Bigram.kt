package com.example.effectivejava.five

data class Bigram(
    private val first: Char,
    private val second: Char,
) {

    fun main() {
        val s = HashSet<Bigram>()

        repeat(10) {
            ('a'..'z').forEach {
                s.add(Bigram(it, it))
            }
        }

        println(s.size)
    }

}

