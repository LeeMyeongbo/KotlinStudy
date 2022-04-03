// Char 타입 : 문자(한 글자씩)를 저장할 수 있는 타입 (Character 줄임말)
// String 타입 : 문자 나열한 거 ㅇㅇ

fun main() {
    var ch:Char = 'A'
    println(ch.toInt())

    ch = '\uAC00'
    println(ch.toInt())

    ch = '눈'
    println(ch.toInt())

    var str:String = "Kotlin"
    println(str)

    str += "\n코틀린이당"
    println(str)

    println(str[5])

    val number = 123
    str = str + number
    println(str)                // 문자열 + 숫자(Int) = 문자열
}