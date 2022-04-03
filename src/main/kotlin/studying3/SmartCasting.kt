package studying3

// is 연산자 : 타입을 확인하는 연산자
// java 의 경우 instanceof 와 비슷

fun smartCast(data:Any):Int {                    // data 의 타입이 Int 인지 확인(Int 타입이 맞으면 is에 의해 자동으로 형 변환)
    return if (data is Int) data * data else 0   // smartCasting
}

fun main() {
    println("result : ${smartCast(100)}")
    println("result : ${smartCast(11.1)}")
}