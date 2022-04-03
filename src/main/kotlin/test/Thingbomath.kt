package test

fun main() {
    val x = 100
    val y = -20

    // 다른 패키지에 있는 함수를 사용할 땐 "패키지명.함수명()" 으로 사용
    println(studying.min(x, studying.abs(y)))
}