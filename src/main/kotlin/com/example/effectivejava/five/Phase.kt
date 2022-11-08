package com.example.effectivejava.five

import java.util.EnumMap

enum class Phase {

    SOLID,
    LIQUID,
    GAS,
    ;

    private enum class Transition(
        val from: Phase, private val to: Phase,
    ) {

        MELT(SOLID, LIQUID),
        FREEZE(LIQUID, SOLID),
        BOIL(LIQUID, GAS),
        CONDENSE(GAS, LIQUID),
        SUBLIME(SOLID, GAS),
        DEPOSIT(GAS, SOLID),
        ;

        companion object {
            private val m = values().associateByTo(
                EnumMap(Phase::class.java),
                { it.from },
                { EnumMap(mapOf(it.to to it)) }
            )

            fun from(from: Phase, to: Phase) = m[from]?.get(to)
        }

    }

}