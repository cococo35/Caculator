package com.android.caculator

class AddOperation() : Caculator() {
    override fun Operate(num1: Double,num2: Double): Double {
        return num1 + num2
    }
}