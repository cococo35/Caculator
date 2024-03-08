package com.android.caculator

class DivideOperation() : AbstractOperation() {
    override fun Operate(num1: Double,num2: Double): Double {
        require(num2.toInt() != 0) {
            ArithmeticException("0으로 나눌 수 없습니다!")
        }
        return num1 / num2
    }
}