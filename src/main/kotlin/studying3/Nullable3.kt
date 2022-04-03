package studying3

// ?.(safe call operator) : 안전한 호출 연산자 (Null 인지 아닌지 확인)
// 일반적인 프밍에서는 if else 이용해서 null 확인을 하는데 코틀린에서는 손쉽게 null 확인을 위한 연산자를 제공하고 있음

fun main() {
    var aa:String? = "hello"

    var len:Int? = aa?.length        // val length1:Int? = if (aa != null) aa.length else null 과 같음
    println(len)

    aa = null
    len = aa?.length
    println(len)
}