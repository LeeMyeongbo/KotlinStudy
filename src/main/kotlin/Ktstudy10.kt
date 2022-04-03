// 가변인수 : vararg 키워드 이용하여 가변적으로 매개변수 사용

fun main() {
    val sum1 = getTotal(1,2,3)
    val sum2 = getTotal(10,11,22,33,44,55)
    val sum3 = getTotal(11,222,333,444,555,666,8787,342424,2111111)
    val sum4 = getTotal()       // 아무것도 전달하지 않아도 가능 (size = 0이겠지)
    println("sum1: $sum1, sum2: $sum2, sum3: $sum3, sum4: $sum4")
}

fun getTotal(vararg num:Int):Int {      // 가변인수 num -> 여러 개 올 수 있음(일종의 배열로 보자)
    val cnt = num.size                  // size 통해 num 으로 전달받은 인수 개수 알 수 있음
    var i = 0; var sum=0                // ;으로 구분

    while (i < cnt) {
        sum += num[i]
        i++
    }

    return sum
}

/*
    가변 인수와 일반 변수를 같이 사용 가능 but
    fun myFunc(something:Char, vararg numbers:Int):Int  --> 가변인수는 일반인수의 오른쪽에 배치
    fun myFunc(vararg numbers:Int, something:Char):Int  --> 오류!
    fun myFunc(vararg numbers:Int, something = Char 타입 인수):Int  --> 가능!
*/
