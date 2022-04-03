package studying2

// Any 클래스를 이용한 다형성

class Product3(var name:String, var price:Int) {
    override fun toString():String = "상품명 : ${this.name}, 가격 : ${this.price}"
}

fun main() {
    val product2 = Product2("랩몬스터", "2022-04-02", 8000000)
    getProductInfo(product2)
    println()

    val product3 = Product3("내 이름은 김근육", 50)
    getProductInfo(product3)

    val arr = IntArray(5)
    arr[0] = 1
    arr[1] = 5
    arr[2] = 6
    arr[3] = 0
    arr[4] = 7
}

fun getProductInfo(any:Any) {       // 타입은 Any 타입이지만 오버라이딩된 toString()을 실행하게 됨(업캐스팅, 다형성)
    println(any.toString())
}