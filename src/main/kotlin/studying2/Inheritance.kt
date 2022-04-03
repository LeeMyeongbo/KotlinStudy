package studying2

// 상속(Inheritance)
// 코틀린은 기본적으로 class 의 상속이 막혀 있음(final 이 기본적으로 선언되어 있다고 보면 된다. 상속에 폐쇄적)
// 따라서 클래스 앞에 open 키워드를 이용해서 상속하도록 해줘야 한다!

// 부모 클래스(슈퍼 클래스) 형식
// open class 클래스명

// 확장 클래스(상속받는 클래스) 형식
// class 클래스명:슈퍼클래스 생성자(인수)

open class Human(val name:String, val age:Int)

class Employee(name:String, age:Int, val id:Int):Human(name, age)

fun main() {
    val human = Human("고길똥", 32)
    val employee = Employee("김길똥", 29, 20220402)

    val human1:Human = Employee("이띵보", 26, 20220403)
    println(human1.name)

}

// 캐스팅(Casting) : 형 변환(특정 타입을 다른 타입으로 변환)
// Upcasting : 서브 클래스의 인스턴스를 슈퍼클래스 타입으로 만드는 것