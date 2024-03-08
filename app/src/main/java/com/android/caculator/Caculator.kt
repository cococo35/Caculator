package com.android.caculator

open class Caculator() {
    fun method() {
        println("계산 방법을 선택해 주세요!")
        println("1: +, 2: -, 3: *, 4: /")
    }
    fun start() {
        println("두 수를 입력해 주세요!")
    }

    open fun Operate(num1: Double, num2: Double): Double {
        return 0.0
    }
}