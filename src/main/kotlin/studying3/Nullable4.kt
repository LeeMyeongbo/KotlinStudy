package studying3

// 객체의 연결구조에도 ?. 연산자 사용할 수 있다.

class Address {
    var city:String? = "Seoul"
}

class Person {
    var address:Address? = Address()
}

fun main() {
    var person:Person? = Person()
    println(person?.address?.city)               // person 과 address 모두 null 인지 아닌지 확인하며 접근
}