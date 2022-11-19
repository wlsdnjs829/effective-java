package com.example.effectivejava.five

data class Bigram(
    private val first: Char,
    private val second: Char,
) {

    fun main() {
        val s = HashSet<Bigram>()

        try {
            repeat(10) {
                ('a'..'z').forEach {
                    s.add(Bigram(it, it))
                }
            }
        } catch (ignored: Exception) {
            // 예외 무시 케이스 테스트
        }


        println(s.size)
    }

}

