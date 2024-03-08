package com.android.caculator

class DivideOperation() : Caculator() {
    override fun Operate(num1: Double,num2: Double): Double {
        if(num2.toInt() == 0) println("0으로 나눌 수 없습니다!")
        return num1 / num2
    }
}