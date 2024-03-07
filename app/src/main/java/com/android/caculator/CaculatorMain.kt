package com.android.caculator

fun main() {
    println("계산 방법을 선택해 주세요!")
    println("1: +, 2: -, 3: *, 4: /")

    val sign = readLine()!!.toInt()

    if (sign > 5 || sign < 1) {
        println("올바른 숫자를 입력해 주세요!")
        return
    }

    println("두 수를 입력해 주세요!")

    var Work = Caculator()
    var result = 0.0

    when(sign) {
        1 -> {
            Work = AddOperation()
            result = Work.Add(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        2 -> {
            Work = SubstractOperation()
            result = Work.Minus(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        3 -> {
            Work = MultiplyOperation()
            result = Work.Multiply(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        4 -> {
            Work = DivideOperation()
            result = Work.Divide(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
    }

    println("1: 계산 이어서 하기, -1: 계산 그만하기")

    val sign2 = readLine()!!.toInt()
    if(sign2 == -1) return

    while(true) {
        println("계산 방법을 선택해 주세요!")
        println("1: +, 2: -, 3: *, 4: /")

        val sign3 = readLine()!!.toInt()

        if (sign3 > 5 || sign3 < 1) {
            println("올바른 숫자를 입력해 주세요!")
            return
        }

        println("숫자를 입력해 주세요!")
        
        var Work = Caculator()

        when (sign3) {
            1 -> {
                Work = AddOperation()
                result = Work.Add(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            2 -> {
                Work = SubstractOperation()
                result = Work.Minus(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            3 -> {
                Work = MultiplyOperation()
                result = Work.Multiply(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            4 -> {
                Work = DivideOperation()
                result = Work.Divide(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }
        }

        println("1: 계산 이어서 하기, -1: 계산 그만하기")
        val sign4 = readLine()!!.toInt()

        if(sign4 == 1) continue
        else if(sign4 == -1) return
        else return
    }
}

open class Caculator() {}

class AddOperation() : Caculator() {
    fun Add(num1: Double, num2: Double): Double {
        return num1 + num2
    }
}

class SubstractOperation() : Caculator() {
    fun Minus(num1: Double, num2: Double): Double {
        return num1 - num2
    }
}

class MultiplyOperation() : Caculator() {
    fun Multiply(num1: Double, num2: Double): Double {
        return num1 * num2
    }
}

class DivideOperation() : Caculator() {
    fun Divide(num1: Double, num2: Double): Double {
        if(num2.toInt() == 0) println("0으로 나눌 수 없습니다!")
        return num1 / num2
    }
}