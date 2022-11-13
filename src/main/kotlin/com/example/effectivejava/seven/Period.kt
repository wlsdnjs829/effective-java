package com.example.effectivejava.seven

import java.util.Date

class Period(start: Date, end: Date) {

    private val start: Date
        get() = Date(field.time)

    private val end: Date
        get() = Date(field.time)

    init {
        this.start = Date(start.time)
        this.end = Date(end.time)

        require(this.start <= this.end) { "${this.start}가 ${this.end}보다 늦다" }
    }

}