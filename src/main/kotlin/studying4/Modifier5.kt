package studying4

// 코틀린에서는 변수가 프로퍼티. 즉, 변수는 getter/setter 를 포함

class AccessPropertyTest {
    private var data:Int = 100

    fun getData():Int {
        return data
    }
}

fun main() {
    val obj = AccessPropertyTest()
    // println("${obj.data} ...")       // private 멤버이기 때문에 직접 접근 안됨
    println("${obj.getData()} ...")     // public 함수 통해서 읽기 가능
}