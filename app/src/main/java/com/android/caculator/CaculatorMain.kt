package com.android.caculator

fun main() {
    var result = 0.0
    var Work = Caculator(AddOperation())

    Work.method()

    val sign = readLine()!!.toInt()

    if (sign > 5 || sign < 1) {
        println("올바른 숫자를 입력해 주세요!")
        return
    }

    Work.start()

    when(sign) {
        1 -> {
            Work = Caculator(AddOperation())
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        2 -> {
            Work = Caculator(SubstractOperation())
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        3 -> {
            Work = Caculator(MultiplyOperation())
            result = Work.Operate(readLine()!!.toDouble(), readLine()!!.toDouble())
            println("계산결과: ${result}")
        }
        4 -> {
            Work = Caculator(DivideOperation())
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

        var Work = Caculator(AddOperation())
        Work.start()

        when (sign3) {
            1 -> {
                Work = Caculator(AddOperation())
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            2 -> {
                Work = Caculator(SubstractOperation())
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            3 -> {
                Work = Caculator(MultiplyOperation())
                result = Work.Operate(result, readLine()!!.toDouble())
                println("계산결과: ${result}")
            }

            4 -> {
                Work = Caculator(DivideOperation())
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
//응용하고 실제로 사용하려면 많이 연습해야할 것 같다..