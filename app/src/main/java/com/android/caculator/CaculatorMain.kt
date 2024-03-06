package com.android.caculator

fun main() {
    var calc = Calculator()

    println("계산할 방법을 선택해 주세요!")
    println("1번: +, 2번: -, 3번: *, 4번: /, 5번: %, -1번: 계산 그만하기")

    val sign = readLine()!!.toInt()

   if(sign == -1) {
       println("계산종료")
       return
   }
    else if(sign > 5 || sign < 1) {
        println("올바른 숫자를 입력해 주세요!")
       return
   }

    println("두 숫자를 입력해 주세요!")

    var num1 = readLine()!!.toInt()
    var num2 = readLine()!!.toInt()

    when(sign) {
        1 -> println("덧셈결과: ${calc.add(num1, num2)}")
        2 -> println("뺄셈결과: ${calc.minus(num1, num2)}")
        3 -> println("곱셈결과: ${calc.multifly(num1, num2)}")
        4 -> println("나눗셈결과: ${calc.divide(num1, num2)}")
        5 -> println("나머지결과: ${calc.remain(num1, num2)}")
    }
}

class Calculator {

    fun add(num1: Int, num2: Int): Int {
        return num1 + num2
    }

    fun minus(num1: Int, num2: Int): Int {
        return num1 - num2
    }

    fun multifly(num1: Int, num2: Int): Int {
        return num1 * num2
    }

    fun divide(num1: Int, num2: Int): Int {
        return num1 / num2
    }

    fun remain(num1: Int, num2: Int): Int {
        return num1 % num2
    }
}