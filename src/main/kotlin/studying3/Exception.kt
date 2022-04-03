package studying3

// 예외(Exception) : 프로그램 실행 중에 에상치 못했던 문제가 발생하는 상황
// 이러한 예외가 발생하면 프로그램은 오류 메세지를 출력하며 강제로 종료

fun main() {
    val str = "Hello"
    val num = str.toInt()       // 문자가 들어있는 경우에는 정수형으로 바꿀 수 없음 -> 예외

    println(num)
}