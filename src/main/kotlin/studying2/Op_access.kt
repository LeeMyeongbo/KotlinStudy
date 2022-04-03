package studying2

// [] 연산자 : Indexed Access Operator

class Person(var name:String, var birthday:String) {
    operator fun get(position:Int):String {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "모름"
        }
    }

    operator fun set(position:Int, value:String) {
        when (position) {
            0 -> name = value
            1 -> birthday = value
        }
    }
}

fun main() {
    val person = Person("고길똥", "1972-11-12")
    println(person[0])          // 실제 처리되는 코드 : person.get(0)
    println(person[1])          // 실제 처리되는 코드 : person.get(1)

    person[0] = "고길똥막대기"    // 실제 처리되는 코드 : person.set(0, "고길똥막대기")
    println(person.name)
    person[1] = "1972-11-11"    // 실제 처리되는 코드 : person.set(1, "1972-11-11")
    println(person.birthday)
}