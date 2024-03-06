package com.android.caculator

fun main() {
    var calc = Calculator()

    println("계산할 방법을 선택해 주세요!")
    println("1: +, 2: -, 3: *, 4: /, 5: %")

    val sign = readLine()!!.toInt()

    if (sign > 5 || sign < 1) {
        println("올바른 숫자를 입력해 주세요!")
        return
    }

    println("두 숫자를 입력해 주세요!")

    var num1 = readLine()!!.toDouble()
    var num2 = readLine()!!.toDouble()
    var result = 0.0

    when (sign) {
        1 -> {
            result = calc.add(num1, num2)
            println("덧셈결과: ${result}")
        }

        2 -> {
            result = calc.minus(num1, num2)
            println("뺄셈결과: ${result}")
        }

        3 -> {
            result = calc.multifly(num1, num2)
            println("곱셈결과: ${result}")
        }

        4 -> {
            result = calc.divide(num1, num2)
            println("나눗셈결과: ${result}")
        }

        5 -> {
            result = calc.remain(num1, num2)
            println("나머지결과: ${result}")
        }
    }
    println("1: 계산 이어서하기, -1: 계산 그만하기")

    val sign2 = readLine()!!.toInt()

    if(sign2 == -1) return

    while (true) {
        println("계산할 방법을 선택해 주세요!")
        println("1: +, 2: -, 3: *, 4: /, 5: %")

        var sign3 = readLine()!!.toInt()

        if (sign3 > 5 || sign3 < 1) {
            println("올바른 숫자를 입력해 주세요!")
            return
        }

        println("숫자를 입력해 주세요!")

        var num4 = readLine()!!.toDouble()

        when (sign3) {
            1 -> {
                result = calc.add(result, num4)
                println("덧셈결과: ${result}")
            }

            2 -> {
                result = calc.minus(result, num4)
                println("뺄셈결과: ${result}")
            }

            3 -> {
                result = calc.multifly(result, num4)
                println("곱셈결과: ${result}")
            }

            4 -> {
                result = calc.divide(result, num4)
                println("나눗셈결과: ${result}")
            }

            5 -> {
                result = calc.remain(result, num4)
                println("나머지결과: ${result}")
            }
        }

        println("1: 계산 이어하기, -1: 계산 그만하기")

        var sign4 = readLine()!!.toInt()

        if(sign4 == 1) continue
        else if(sign4 == -1) return
        else {
            println("올바른 숫자를 입력해 주세요!")
            return
        }
    }
}

class Calculator {

    fun add(num1: Double, num2: Double): Double {
        return num1 + num2
    }

    fun minus(num1: Double, num2: Double): Double {
        return num1 - num2
    }

    fun multifly(num1: Double, num2: Double): Double {
        return num1 * num2
    }

    fun divide(num1: Double, num2: Double): Double {
        if(num2.toInt() == 0) println("0으로 나눌 수 없습니다!")
        return num1 / num2
    }

    fun remain(num1: Double, num2: Double): Double {
        if(num2.toInt() == 0) println("0으로 나눌 수 없습니다!")
        return num1 % num2
    }
}