package studying

class Demo {
    var num = 100

    fun demoFunc(num1:Int) {
        println(num1)
        println(num)                // 매개변수와 프로퍼티가 다를 경우에는 this 로 구분할 필요는 x (같으면 구분)
    }
}

fun main() {
    val demo = Demo()
    demo.demoFunc(200)
}