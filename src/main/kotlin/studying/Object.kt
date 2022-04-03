package studying

// 객체(Object)

fun main() {
    // person 이라는 객체 생성
    val person = object {   // object 내에서 선언되는 변수들은 모두 heap 에 저장됨(person 에는 object 주소값이 저장됨. 참조변수)
        // object 객체에 포함된 변수들을 속성(property)이라 부름
        val name:String = "김띵보"
        val age:Int = 26
    }
    println(person.name)
    println(person.age)
}
