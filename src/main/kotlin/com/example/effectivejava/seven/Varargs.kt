package com.example.effectivejava.seven

class Varargs {

    companion object {

        fun sum(vararg args: Int): Int {
            return args.sum()
        }

        fun min(min: Int, vararg args: Int): Int? {
            return args.minOrNull()
                ?.let { min.coerceAtMost(it) }
        }

        fun foo() {}
        fun foo(a1: Int) {}
        fun foo(a1: Int, a2: Int) {}
        fun foo(a1: Int, a2: Int, a3: Int) {}
        fun foo(a1: Int, a2: Int, a3: Int, vararg rest: Int) {}

    }

}

fun main() {
    println(Varargs.sum(1, 2, 3))
    println(Varargs.min(1, 2, 3, 0))
}