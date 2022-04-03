package studying3

// Nothing 타입 : 함수가 정상적으로 끝나지 않는다는 것을 나타내기 위한 특수 타입.
// throw Exception() 표현식은 Nothing 타입이다.
// 함수의 반환 타입을 Nothing 타입으로 설정하면 컴파일러가 정상종료가 되지 않는 함수임을 미리 알 수 있음.

fun throwing():Nothing = throw Exception()

fun main() {
    println("프로그램 시작")
    val a:Int = throwing()      // Nothing 타입은 어떤 타입과도 호환 가능
    println("프로그램 종료")
}

/*
    val x:Int = if (aa >= 0) aa else throw Exception("aa는 음수")
*/