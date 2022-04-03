package studying2

// 함수의 중위표현식(Infix Notation)
// 중위 표기법을 사용하기 위해서는 함수 앞에 infix 키워드를 지정한다.
// infix 선언이 가능한 함수 : 매개변수가 하나인 함수 or 클래스의 멤버함수 or 클래스의 확장함수

class NewPoint(var x:Int = 0, var y:Int = 0) {

    // 좌표의 차이값을 리턴
    infix fun difference(point:NewPoint):NewPoint {
        return NewPoint(x - point.x, y - point.y)
    }
}

fun main() {
    val pt = NewPoint(20, 30) difference NewPoint(10, 10)       // (20, 30) - (10, 10)과 같음
    println(pt.x)
    println(pt.y)
}