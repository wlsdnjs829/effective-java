package com.example.effectivejava.two

class Elvis private constructor() {

    companion object {
        private val INSTANCE = Elvis()
        fun getInstance() = INSTANCE
    }

    // 진짜 Elvis를 반환하고, 가짜 Elvis는 가비지 컬렉터에 맡긴다.
    private fun readResolve(): Any = INSTANCE

}