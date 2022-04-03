package studying2

// 단항 연산자(unary)
/*
    표현식        함수 이름        컴파일러에서 동작하는 명령
    +a           unaryPlus          a.unaryPlus()
    -a           unaryMinus         a.unaryMinus()
    !a            not               a.not()
*/

// 이항 연산자
/*
    a + b        plus               a.plus(b)
    a - b        minus              a.minus(b)
    a * b        times              a.times(b)
    a / b        div                a.div(b)
    a % b        rem                a.rem(b)
    a += b       plusAssign         a.plusAssign(b)
    a -= b       minusAssign        a.minusAssign(b)
    a *= b       timesAssign        a.timesAssign(b)
    a /= b       divAssign          a.divAssign(b)
    a %= b       remAssign          a.remAssign(b)
    a > b        compareTo          a.compareTo(b) > 0
    a < b           ""              a.compareTo(b) < 0
    a >= b          ""              a.compareTo(b) >= 0
    a <= b          ""              a.compareTo(b) <= 0
    a == b        equals            a?.equals(b)?:(b===null)
    a != b          ""              a.?.equals(b)?:(b===null)
*/

class Point(var x:Int = 0, var y:Int = 0) {

    // 함수에 operator 키워드를 이용해서 오버로딩
    operator fun plus(point:Point):Point {
        return Point(x + point.x, y + point.y)
    }

    operator fun minus(point:Point):Point{
        return Point(x - point.x, y - point.y)
    }

    operator fun times(num:Int):Point {
        return Point(x * num, y * num)
    }

    operator fun div(num:Int):Point {
        return Point(x / num, y / num)
    }

    fun output() {
        println("x = $x, y = $y")
    }
}

fun main() {
    val point1 = Point(10, 20)
    val point2 = Point(20, -5)

    val point3 = point1 + point2
    val point4 = point3 * 10
    val point5 = point4 / 5

    point3.output()
    point4.output()
    point5.output()
}