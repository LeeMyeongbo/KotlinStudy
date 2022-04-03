package studying
/*
    주생성자 : class 클래스명 constructor(매개변수) {
        // 보조 생성자1
        constructor(매개변수):this(인수) {
            ...
        }

        // 보조 생성자2
        constructor(매개변수):this(인수) {
            ...
        }
    }
*/
class Car(val speed:Int = 120) {       // 생성자 정의와 프로퍼티 선언을 한번에 처리
    init {
        println("init 블록 실행...")
    }

    // 보조 생성자1
    constructor(name:String, speed:Int):this(speed) {                           // 기본 생성자 호출하면서 실행
        println("이름 : $name, 속도 : $speed")
        println("보조 생성자1 실행 중")
    }

    // 보조 생성자2
    constructor(name:String, speed:Int, company:String):this(name, speed) {     // 보조 생성자1 호출하면서 실행
        println("이름 : $name, 속도 : $speed, 회사 : $company")
        println("보조 생성자 2 실행중")
    }
}

fun main() {
    //val car = Car(200)
    //val car2 = Car("제네시스", 1)
    val car3 = Car("제네시스", 2, "엑스칼리버")
}