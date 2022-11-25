package com.example.effectivejava.eleven

import com.example.effectivejava.seven.Period
import java.io.Serializable
import java.util.Date

class SerializationProxy(period: Period) : Serializable {

    companion object {
        const val serialVersionUID: Long = 234098243823485285L
    }

    private val start: Date
    private val end: Date

    init {
        this.start = period.start
        this.end = period.end
    }

    private fun readResolve(): Any = Period(start, end)

}