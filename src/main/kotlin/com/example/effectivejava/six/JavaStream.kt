package com.example.effectivejava.six

import java.math.BigInteger
import java.util.stream.LongStream

class JavaStream {

    companion object {

        fun pi(n: Long) = LongStream.rangeClosed(2, n)
            .parallel()
            .mapToObj(BigInteger::valueOf)
            .filter { it.isProbablePrime(50) }
            .count()

    }

}