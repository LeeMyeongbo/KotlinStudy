package studying2

// Any 클래스 : 코틀린에서의 최상위 클래스 (자바에서의 Object 클래스와 같음) -> 모든 클래스의 부모 클래스
// 클래스가 아무 클래스도 상속 받지 않는다면 자동으로 Any 클래스를 상속 받는 거
// 특정한 클래스를 상속 받는다 해도 자동으로(간접적으로) Any 클래스를 상속 받는 거와 같다
// 따라서, 모든 클래스는 Any 클래스를 상속받는다

/*
    Any 클래스의 3가지 멤버함수
    open class Any {
        open operator fun equals(other:Any?):Boolean        --> == 와 같음
        open fun hashCode():Int                             --> 해시코드 반환 함수
        open fun toString():String                          --> 객체 타입을 String 타입으로 반환
    }
*/

class Product2(val name:String = "",    // 상품명
               val rDate:String = "",   // 출시일
               val price:Int = 0) {     // 상품 가격

    override fun toString():String = "상품명 : $name\n출시일 : $rDate\n가격 : ${price}원"
}

fun main() {
    val product = Product2("컴피터", "1972-11-12", 500000)
    println(product.toString())
}