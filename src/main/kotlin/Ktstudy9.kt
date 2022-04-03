/*
    함수 : 명령어들을 담은 상자로 이해
    Unit 은 반환값이 없는 타입을 의미 (Unit 타입) -> C, Java 의 void 와 같다
*/

fun main() {
    println(myFun())
    println(aa())
    println(aa1())

    val xx = aa(30)
    println(xx)
    val yy = aa(20, 30)
    println(yy)
    val zz = aa2(9)
    println(zz)

    val avg = getAvg(55, 88)
    println(avg)
    val avg2 = getAvg(77, 88, true)
    println(avg2)
    val avg3 = getAvg()
    println(avg3)
    val avg4 = getAvg(print = true, b = 100, a = 50)
    println(avg4)
}

fun myFun():Int {       // 인자(파라미터, 매개변수)가 없는 함수
    val a = 10
    val b = 11
    println("a: $a, b: $b")

    return a + b
}
/*
fun aa():Double {       // 한 줄로 줄일 수 있음
    return 3.0 + 100
} */
fun aa():Double = 3.0 + 100                             // return 은 반드시 생략
fun aa1() = 3.0 + 100                                   // 타입 생략 가능
fun aa(x:Int):Double = x * 1.2 + 20
fun aa(a:Int, b:Int):Double = (a + b) / 2.0
/*fun aa2(xx:Int) {                                     // Unit 타입은 생략이 가능
    println(xx * 1.0 + 30)
}*/
fun aa2(xx:Int) = println(xx * 1.0 + 30)                // 역시 한 줄로 표현가능
fun getAvg(a:Int = 0, b:Int = 0, print:Boolean = false):Double {    // 디폴트 인수 (매개변수가 기본값을 가짐)
    val result = (a + b) / 2.0
    if (print)
        println(result)
    return result
}