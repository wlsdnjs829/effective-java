package com.example.effectivejava.five

enum class PayrollDay(private val payType: PayType) {

    MONDAY(PayType.WEEKDAY),
    TUESDAY(PayType.WEEKDAY),
    WEDNESDAY(PayType.WEEKDAY),
    THURSDAY(PayType.WEEKDAY),
    FRIDAY(PayType.WEEKDAY),
    SATURDAY(PayType.WEEKDAY),
    SUNDAY(PayType.WEEKEND),
    ;

    fun pay(minutesWorked: Int, payRate: Int) = payType.pay(minutesWorked, payRate)

    private enum class PayType {

        WEEKDAY {
            override fun overtimePay(mins: Int, payRate: Int) =
                if (mins <= Const.MINS_PER_SHIFT) {
                    0
                } else {
                    (mins - Const.MINS_PER_SHIFT) * payRate / 2
                }
        },
        WEEKEND {
            override fun overtimePay(mins: Int, payRate: Int) = mins * payRate / 2
        };


        abstract fun overtimePay(mins: Int, payRate: Int): Int

        private object Const {
            const val MINS_PER_SHIFT = 8 * 60
        }

        fun pay(minsWorked: Int, payRate: Int): Int {
            val basePay = minsWorked * payRate
            return basePay + overtimePay(minsWorked, payRate)
        }

    }

}

