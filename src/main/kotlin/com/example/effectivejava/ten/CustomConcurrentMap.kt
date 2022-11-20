package com.example.effectivejava.ten

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.ConcurrentMap

class CustomConcurrentMap {

    companion object {
        private val map: ConcurrentMap<String, String> = ConcurrentHashMap()

        fun intern(s: String): String {
            val result = map[s]

            return if (result != null) {
                result
            } else {
                val putIfAbsent = map.putIfAbsent(s, s)
                putIfAbsent ?: s
            }
        }
    }

}