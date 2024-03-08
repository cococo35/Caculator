package com.android.caculator

fun main() {
    var result = 0.0
    var Work = Caculator()

    Work.method()

    val sign = readLine()!!.toInt()

    if (sign > 5 || sign < 1) {
        println("올바른 숫자를 입력해 주세요!")
        return
    }

    Work.start()

    when(sign) {
        1 -> {
            Work = AddOperation()
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        2 -> {
            Work = SubstractOperation()
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        3 -> {
            Work = MultiplyOperation()
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        4 -> {
            Work = DivideOperation()
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
    }

    println("1: 계산 이어서 하기, -1: 계산 그만하기")

    var ContinueOrStop = readLine()!!.toInt()
    if(ContinueOrStop == -1) return

    while(true) {
        Work.method()

        val sign3 = readLine()!!.toInt()

        if (sign3 > 5 || sign3 < 1) {
            println("올바른 숫자를 입력해 주세요!")
            return
        }

        var Work = Caculator()
        Work.start()

        when (sign3) {
            1 -> {
                Work = AddOperation()
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            2 -> {
                Work = SubstractOperation()
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            3 -> {
                Work = MultiplyOperation()
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            4 -> {
                Work = DivideOperation()
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }
        }

        println("1: 계산 이어서 하기, -1: 계산 그만하기")
        ContinueOrStop = readLine()!!.toInt()

        if(ContinueOrStop == 1) continue
        else if(ContinueOrStop == -1) return
        else return
    }
}

//이전 Lv3과의 변경점: 기존에는 Class 파일을 따로 생성하지 않고 CaculatorMain.kt 안에 그대로 Class를 생성해서 보기 불편했다. 그리고 기존에는
//override를 사용하지 않아 Operation 각각 num1, num2를 받고 계산하였다. 기존에도 open class 안에 fun 함수를 만들어 override 하려고 시도는 했지만
//기억상 함수를 만들 때 open fun을 쓰지 않고 그냥 fun 함수를 만들어서 override가 안됐던 것 같다(아마?)