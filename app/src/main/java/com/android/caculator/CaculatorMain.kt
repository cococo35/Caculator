package com.android.caculator

fun main() {
    var number = AddOperation(1.0, 2.0)
    var num2 = 0.0
    var result = number.Add(1.0, 2.0)
    println(result)
}

open class Caculator(num1: Double, num2: Double) {
    var num1: Double = 0.0
    var num2: Double = 0.0

    init {
        this.num1 = num1
        this.num2 = num2
    }
}

class AddOperation(num1: Double, num2: Double) : Caculator(num1, num2) {
    fun Add(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}

class SubstractOperation(num1: Double, num2: Double) : Caculator(num1, num2) {
    fun Minus(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}

class MultiplyOperation(num1: Double, num2: Double) : Caculator(num1, num2) {
    fun Multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }
}

class DivideOperation(num1: Double, num2: Double) : Caculator(num1, num2) {
    fun Divide(num1: Double, num2: Double): Double {
        return num1 / num2
    }
}