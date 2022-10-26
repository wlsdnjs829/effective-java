package com.example.effectivejava.two

import java.util.regex.Pattern

class Pattern {

    companion object {
        private val ROMAN: Pattern = Pattern.compile("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$")
        fun isRomanNumeral(target: String) = ROMAN.matcher(target).matches()
    }

}