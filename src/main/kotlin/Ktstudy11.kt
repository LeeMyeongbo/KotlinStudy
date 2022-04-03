// 오버로딩(overloading) : 같은 이름의 함수를 매개변수를 다르게 하여(타입 or 개수) 여러 개 정의
// 함수 시그니쳐(Function signiture)
// fun avg(one:Int, two:Int):Double     -->     함수 시그니쳐임!   (두 함수의 시그니쳐가 같으면 오버로딩이 불가!)

fun some(a:String) {
    println("some(a:String) 호출...")
}

fun some(a:Int) {
    println("some(a:Int) 호출...")
}

fun some(a:Int, b:String) {
    println("some(a:Int, b:String) 호출...")
}

fun main() {
    some("Hello")
    some(100)
    some(100, "Hello")
}