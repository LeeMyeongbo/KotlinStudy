package studying3

import studying2.*

fun main() {
    val product = Product2("의자", "2022-04-03", 100000)
    println(product.toString())

    val product2 = Product3("책상", 262520)
    println(product2.toString())

    // 자바는 모든 참조타입에 null 을 지정할 수 있다.
    // but 코틀린은 Nullable 타입이 아니면 null 을 지정할 수 없다.
    // Nullable 타입은 Heap 메모리에 저장된다.

    var human:Human? = Human("홍길동", 30)         // ? : Nullable 연산자 (human 객체는 null 일 수도 있음을 의미)
    human = null

    var aa:Int? = null
    aa = 100
}