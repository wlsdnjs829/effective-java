package com.example.effectivejava.two

import java.util.EnumSet

class ObjectManage {

    companion object {
        private const val DATA = "data"
        private const val EMPTY = ""

        fun valueOf(boolean: Boolean): String =
            if (boolean) {
                DATA
            } else {
                EMPTY
            }
    }

}