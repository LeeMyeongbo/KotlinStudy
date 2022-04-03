// 지역(Local), 전역(global), scope(유효 범위)

var count = 0           // 전역 : 함수 밖에 선언(모든 함수에서 사용가능)

fun main() {
    val aa = 20         // 지역 : 블록 안에 선언(블록 벗어나면 사라짐)
    println(aa)

    outputCount()
    println(count)

    val count = 9       // 이름이 중복되는 경우 현재 실행되고 있는 코드와 가장 가까운 스코프의 변수가 우선적으로 인식됨.
    println(count)      // but 같은 scope 내에서 이름이 같은 변수를 동시에 선언할 순 없음
    myFunc()

    //aa2()             // 지역 함수(local function)는 반드시 정의 후 호출해야 함
    fun aa2() {
        println("내부함수 aa2...")
    }
    aa2()
}

fun outputCount() {
    println(count)
    count += 10
}

fun myFunc() {
    val count = 100
    println(count)
}