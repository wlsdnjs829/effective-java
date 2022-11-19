package com.example.effectivejava.ten

import java.util.concurrent.TimeUnit

class StopThread {

    companion object {
        @Volatile
        private var stopRequested: Boolean = false

        @Synchronized
        private fun requestStop() {
            stopRequested = true
        }

        @Synchronized
        private fun stopRequested() = stopRequested

        fun main() {
            val backgroundThread = Thread {
                var i = 0

                while (!stopRequested) {
                    i++
                }
            }

            backgroundThread.start()

            TimeUnit.SECONDS.sleep(1)
            stopRequested = true
        }
    }

}