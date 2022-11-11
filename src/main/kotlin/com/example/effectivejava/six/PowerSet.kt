package com.example.effectivejava.six

class PowerSet {

    companion object {

        fun <E> of(set: Set<E>) : Collection<Set<E>> {
            val src = set.toList()

            if (src.size > 30) {
                throw IllegalArgumentException("집합에 원소가 너무 많습니다. (최대 30개)")
            }

            return object : AbstractList<Set<E>>() {
                override val size: Int = 1 shl src.size

                override fun get(index: Int): Set<E> {
                    val result = mutableSetOf<E>()

                    var i = 0
                    var tempIndex = index

                    while (tempIndex != 0) {
                        if ((tempIndex and 1) == 1) {
                            result.add(src[i])
                        }

                        i++
                        tempIndex = tempIndex shr 1
                    }

                    return result
                }

                override fun contains(element: Set<E>): Boolean {
                    return src.containsAll(element)
                }

            }

        }

    }

}