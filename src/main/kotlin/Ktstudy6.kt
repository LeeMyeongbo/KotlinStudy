/*
    when (타깃 표현식) {
        타깃표현식과 비교되는 값 -> {
            코드
        }
    }
*/

fun main() {
    val score = 20
    when (score / 10) {                 // switch-case 문과 비슷
        6 -> { println("D") }           // score / 10이 6일 때 D 출력
        7 -> { println("C") }           // score / 10이 7일 때
        8 -> { println("B") }           // score / 10이 8일 때
        9, 10 -> { println("A") }       // 9 또는 10일 때
        else -> { println("F") }        // 그 외 나머지는 F (switch case 문의 default)
    }

    // when 표현식도 if 표현식과 마찬가지로 else 블록을 포함해야 한다.
    val jumsu = 98
    val grade:Char = when (jumsu / 10) {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9, 10 -> 'A'
        else -> 'F'
    }
    println(grade + "학점")

    // 문자열도 쌉가능
    val data1 = "hello world"
    when (data1) {
        "hello" -> println("data1은 hello 입니다.")
        "Kotlin" -> println("data1은 kotlin 입니다.")
        else -> println("data1은 hello, Kotlin 둘 다 아닙니다.")
    }

    val d = -5
    when (d) {
        !in 1..100 -> println("invalid data")
        in 31..40 -> println("31 <= d <= 40")       // in과 ..을 이용해 범위 표현 가능
        in 21..30 -> println("21 <= d <= 30")
        in 11..20 -> println("11 <= d <= 20")
        in 1..10 -> println("1 <= d <= 10")
        else -> println("d > 40")
    }
}