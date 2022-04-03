package studying2

// 다형성(Polymorphism) : 하나의 함수나 클래스가 있을 때 이것들이 다양한 방법으로 동작하는 것

open class SuperClass {
    open fun greeting() = println("Hello!")
}

class SubClass:SuperClass() {
    override fun greeting() = println("Hi!")
}

fun main() {
    val superClass = SuperClass()
    val subClass = SubClass()
    val superClass1:SuperClass = subClass       // 업캐스팅도 일종의 다형성에 해당

    superClass.greeting()
    subClass.greeting()
    superClass1.greeting()                      // 타입은 SuperClass 이지만 override 된 함수 부분은 SubClass 따라감
}