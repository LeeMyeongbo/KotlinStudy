package studying

// 클래스(class) : 객체를 찍어내는 틀(설계도)

class Person {
    var name:String = ""
    var age:Int = 0
}

fun main() {
    val person:Person = Person()        // person : 인스턴스
    person.name = "김말똥"
    person.age = 22

    val person2:Person = Person()
    person2.name = "고길똥"
    person2.age = 24

    val person3:Person = Person()
    person3.name = "똥막대기"
    person3.age = 1972

    println(person3.name)
    println(person3.age)
}