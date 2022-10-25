package com.example.effectivejava.two

class Elvis private constructor() {

    companion object {
        private val INSTANCE = Elvis()
        fun getInstance() = INSTANCE
    }

}