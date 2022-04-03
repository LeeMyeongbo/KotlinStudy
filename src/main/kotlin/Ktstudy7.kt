/*
    while 문
    while (Boolean 표현식) {
        실행시킬 코드 (Boolean 표현식이 참일 동안 실행되는 코드)
    }

    do while 문  ->  최소 한 번은 실행
    do {
        실행시킬 코드
    } while (Boolean 표현식)

    continue 문 : 반복문의 일부 코드를 무시하고 건너뛸 때 사용하는 키워드
    break 문 : 반복문 실행하다가 아예 반복문을 빠져나옴
 */

fun main() {
    var i = 1
    while (i < 10) {
        println(i)
        i += 1
    }

    var a = 1
    do {
        println("먼저 실행되는 코드")
    } while (a == 0)

    var aa = 0
    while (aa < 10) {
        aa += 1
        if (aa % 2 != 0) continue       // 홀수이면 println 실행 x
        println(aa)
    }

    var b = 0
    while (true) {                      // 무한반복
        b += 1
        if (b > 10) break               // 10보다 커지면 중단
        println(b)
    }
}