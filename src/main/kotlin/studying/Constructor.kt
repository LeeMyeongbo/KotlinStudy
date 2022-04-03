package studying

// 생성자(Constructor) : 객체를 초기화하는 멤버함수
// 생성자 만드는 형식
/*
    class 클래스명 constructor(생성자 매개변수 선언) {       -> constructor 키워드는 생략 가능
        ...
    }
*/

// class Human constructor(name:String, age:Int)
class Human(name:String, age:Int){
    var name:String             // 프로퍼티 선언
    var age:Int
    init {                      // 프로퍼티 초기화
        this.name = name
        this.age = age
    }
}

fun main() {
    val human = Human("고길똥", 22)
    println("이름 : " + human.name)
    println("나이 : ${human.age}")
}