package com.example.effectivejava.ten

class SlowCountDownLatch(private var count: Int) {

    init {
        if (count < 0) {
            throw IllegalArgumentException("$count < 0")
        }
    }

    fun await() {
        while (true) {
            synchronized(this) {
                if (count == 0) {
                    return
                }
            }
        }
    }

    @Synchronized
    fun countDown() {
        if (count != 0) {
            count--
        }
    }

}