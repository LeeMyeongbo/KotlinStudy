package studying4

const val myData1:Int = 100
private const val myData2:String = "Hello"      // Modifier2 파일 내에서만 접근 가능

class MyClass1

private class MyClass2

fun myFunc1() {
    println("myFunc1() 호출...")
}

private fun myFunc2() {
    println("myFunc2() 호출...")
}

fun main() {
    println("$myData1 ...")
    println("$myData2 ...")

    val class1 = MyClass1()
    val class2 = MyClass2()

    myFunc1()
    myFunc2()
}