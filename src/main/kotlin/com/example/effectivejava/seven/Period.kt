package com.example.effectivejava.seven

import com.example.effectivejava.eleven.SerializationProxy
import java.io.InvalidObjectException
import java.io.ObjectInputStream
import java.util.Date

class Period(start: Date, end: Date) {

    val start: Date
        get() = Date(field.time)

    val end: Date
        get() = Date(field.time)

    init {
        this.start = Date(start.time)
        this.end = Date(end.time)

        require(this.start <= this.end) { "${this.start}가 ${this.end}보다 늦다" }
    }

    private fun writeReplace(): Any = SerializationProxy(this)

    @Throws(InvalidObjectException::class)
    private fun readObject(stream: ObjectInputStream) {
        throw InvalidObjectException("프록시가 필요합니다")
    }

}