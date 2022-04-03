package studying3

// !!(Not nul Assertion Operator) : Not-null 단정 연산자(Nullable 타입을 Not-null 타입으로 강제 캐스팅)

class Product {
    var name = ""
    var rdate = ""
    var price = 0
}

fun main() {
    var product:Product? = Product()
    product!!.name = "책상"           // Nullable 타입인 product 를 Not-null 로 강제 형 변환
    println(product.name)            // 강제로 캐스팅했기 때문에 ? 연산자 필요 x

    product = null
    // println(product!!.name)       // 오류 발생
}