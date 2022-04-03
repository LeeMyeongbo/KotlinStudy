fun main() {
    val a = 100
    val b = 50

    if (a < b)  println("if문")
    else println("else문")

    if (a < b) println("a가 크다 임마")
    else println("b가 a보다 크거나 같다 임마")

    val jumsu = 85
    if (jumsu >= 90) println("A학점")
    else {
        if (jumsu >= 80) println("B학점")
        else {
            if (jumsu >= 70) println("C학점")
            else println("D학점")
        }
    }

    // 코틀린은 삼항연산자가 없음 -> if 표현식으로 해결가능 (단 반드시 else 블록을 포함!)
    val aa:Int = if (10 > 1) {
        println("10은 1보다 크다.")
        10
    } else {
        println("거짓 입니다.")
        1
    }

    println(aa)

    val result:String = if (a > 10) "Hello" else "World!"       // 한줄로도 당연히 가능!
    println(result)
}