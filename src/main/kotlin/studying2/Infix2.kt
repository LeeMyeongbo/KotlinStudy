package studying2

class FunClass {
    infix fun infixFunc(a:Int):Int {
        println("infixFunc 호출... a = $a")
        return a * a
    }

    infix fun addStr(str:String):String {
        return "고길똥$str"
    }
}

fun main() {
    val obj = FunClass()
    println(obj.infixFunc(10))
    println(obj infixFunc 100)          // obj.infixFunc(100)과 같다 이말이야

    println(obj.addStr("하이!!"))
    println(obj addStr "막대기")
}