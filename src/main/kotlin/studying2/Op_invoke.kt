package studying2

// () 호출 연산자(Invoke Operator) : 함수 호출할 때 사용하는 연산자
// 호출 연산자도 오버로딩이 가능

class Product(val code:Int, val name:String) {
    operator fun invoke(value:Int) {
        println(value)
        println("code : $code\nname : $name")
    }
}

fun main() {
    val prod = Product(20220402, "고길똥막대기")
    prod(200)           // 실제 처리되는 코드 : prod.invoke(200)
}