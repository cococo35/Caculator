package com.android.caculator

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭", 2)
    var sparrow = Sparrow("참새", "갈색")
    var pigeon = Pigeon("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(name:String) {
    var name: String = ""

    init {
        // this는 현재 클래스의 상태변수를 의미합니다
        // var name: String = ""
        this.name = name
    }

    open fun fly() {
        println("${name}은 날아요~")
    }

}

class Chicken(name: String, age: Int) : Bird(name) {
    var age:Int = 0

    init {
        this.age = age
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${age}살의 ${name}가 날아봅니다~ 꼬끼오!")
    }
}

class Sparrow(name: String, color: String) : Bird(name) {
    var color:String = ""

    init {
        this.color = color
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${color}의 ${name}이 날아봅니다~ 짹짹!")
    }
}

class Pigeon(name: String, address: String) : Bird(name) {
    var address: String = ""

    init {
        this.address = address
    }

    override fun fly() {
//        super객체는 부모의 객체를 의미하며 자동으로 생성됨
//        즉 부모객체의 fly메소드를 부르는 행위임
//        필요없으니 주석처리완료
//        super.fly()
        println("${address} 살고있는 ${name}가 날아봅니다~ 구구!")
    }
}