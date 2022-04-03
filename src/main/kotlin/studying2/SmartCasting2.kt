package studying2

class MyClass1 {
    fun fun1() {
        println("fun1() 호출...")
    }
}

class MyClass2 {
    fun fun2() {
        println("fun2() 호출...")
    }
}

fun smartCast2(any:Any) {
    if (any is MyClass1)            // any 는 Any 타입이지만 is 에 의해 MyClass1 타입으로 smart casting 됨
        any.fun1()
    else if (any is MyClass2)       // 스마트 캐스팅에 의해 가능한 것임! (일반적인 업캐스팅으로는 불가!!!)
        any.fun2()
}

fun main() {
    val myClass1 = MyClass1()
    smartCast2(myClass1)

    val myClass2 = MyClass2()
    smartCast2(myClass2)
}