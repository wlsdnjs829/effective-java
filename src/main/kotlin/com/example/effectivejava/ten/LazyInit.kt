package com.example.effectivejava.ten

import kotlin.reflect.jvm.internal.impl.protobuf.WireFormat.FieldType

class LazyInit {

    @Volatile
    private var field: FieldType? = null
        get() {
            val type = field

            if (type != null) {
                return type
            }

            synchronized(this) {
                if (field == null) {
                    // field = 데이터 초기화
                }

                return field
            }
        }

}

