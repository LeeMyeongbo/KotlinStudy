/*
    break 문은 자신과 가장 가까운 반복문 하나만을 빠져나옴
    label 사용법 : 빠져나가고자 하는 반복문에 label명@ 앞에 적어줌 + break@label명

    for (변수 in 리스트) {
        실행코드
    }
    for (i in 리스트 until) {}
 */

fun main() {
    var a = 0
    var b = 0

    outer@ while (a <= 20) {
        b = 0
        while (b <= 20) {
            if (a + b == 15 && a - b == 5)      // a = 10 and b = 5 일 때 멈추고 싶음
                break@outer                     // outer 라는 label 이 붙은 반복문 빠져나옴
            b += 1
        }
        a += 1
    }
    println("a: $a, b: $b")

    var sum = 0
    for (i in 1..10)                    // i에 1, 2, ..., 10 하나씩 넣으며 진행
        sum += i

    println(sum)

   for (i in 1 until 100)           // 1 ~ 99 까지 출력
        println(i)
    for (i in 1..100 step 2)        // 2씩 건너뛰면서 출력
        println(i)
    for (i in 10 downTo 1)          // 10에서 1까지 줄어듦
        println(i)
}