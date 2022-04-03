package studying3

// 예외는 기본적으로 시스템에 의해서 발생. but 사용자가 고의로 예외를 발생시킬 수도 있다(예외를 던진다라고 함)

fun main() {
    try {
        callDiv()
    } catch(e:Exception) {
        println(e.message)      // 자동으로 e에 저장된 메세지 출력
    }
}

fun callDiv() {
    val aa = 10
    val bb = 0
    div(aa, bb)                 // callDiv 함수를 호출한 main 함수로 예외 넘김
}
/*
    예외를 던질 때 형식 : throw Throwable 타입 표현식 (Exception 은 Throwable 을 상속받음. 업캐스팅에 해당)
*/

fun div(a:Int, b:Int):Int {
    if (b == 0)
        throw Exception("0으로 나눌 수 없습니다!")       // callDiv 함수로 예외 넘김
    return a / b
}