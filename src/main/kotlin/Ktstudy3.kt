// typealias : 타입에 별명을 만들어 사용 (타입이 복잡하고 길 때 주로 사용)
// boolean 타입 : 참(true)과 거짓(false) 표현
typealias Number = Int

fun main() {
    var aa = 100
    var bb = 200

    println("aa 값 : $aa")           // 문자열 안에 $변수명이 있으면 변수의 값으로 대체
    println("bb 값 : $bb")

    val a:Number = 100
    println(a)

    var isTrue:Boolean = 199 > 3 * 30
    println(isTrue)

    isTrue = false
    println(isTrue)

    isTrue = aa > bb
    println(isTrue)

    isTrue = aa == bb
    println(isTrue)

    aa = 20
    bb = 30

    var bool:Boolean = (aa - bb < aa + bb) && (aa == 20)
    println(bool)

    bool = !(((aa + bb) > (aa * 3)) || ((bb - aa) > 0))
    println(bool)
}