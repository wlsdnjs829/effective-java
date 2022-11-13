package com.example.effectivejava.seven

open class Wine {
    open fun name() = "포도주"
}

class SparklingWine : Wine() {
    override fun name() = "발포성 포도주"
}

class Champagne : Wine() {
    override fun name() = "샴페인"
}

class Overriding {
    fun main() {
        val wines = listOf(Wine(), SparklingWine(), Champagne())

        wines.forEach { println(it.name()) }
    }
}