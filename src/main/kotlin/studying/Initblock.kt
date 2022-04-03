package studying

// 원래 클래스 만들 때에도 constructor() 부분이 생략되어 있다고 봐도 됨
class Rectangle(width:Int, height:Int) {
    val width:Int
    val height:Int
    init {
        this.height = height
        this.width = width
    }

    val size:Int
    init {
        size = width * height
    }
}

fun main() {
    val rectangle = Rectangle(100, 50)
    println(rectangle.size)
}