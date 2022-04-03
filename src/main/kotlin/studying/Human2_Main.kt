package studying

fun main() {
    val human = Human2()
    human.age = -10         // age 의 setter 프로퍼티가 순간적으로 동작
    println(human.age)      // age 의 getter 프로퍼티가 순간적으로 동작
}