// 지역변수는 stack 메모리 이용 (여기서 stack 은 쌓는다는 개념)
// stack 은 지역변수 뿐만 아니라 매개변수도 저장했다가 함수 종료되면 자동으로 사라짐\
// 메모리에는 stack 영역 이외에도 heap 영역도 있음. 전역변수 or 객체가 저장됨

fun main() {
    val aa = 100
    val bb = -10

    println(max(aa, abs2(bb)))
}

fun abs(num:Int):Int {
    return if (num >= 0) num else -num      // if-else 표현식 -> else 가 반드시 있어야함
}

// 두 수 중 큰 수를 리턴
fun max(a:Int, b:Int):Int = if (a > b) a else b

// 두 수 중 작은 수를 리턴
fun min(x:Int, y:Int):Int = if (x > y) y else x

// 절댓값을 리턴하는 함수
fun abs2(num:Int):Int = if (num >= 0) num else -num