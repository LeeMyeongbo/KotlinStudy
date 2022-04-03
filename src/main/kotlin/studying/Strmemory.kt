package studying

fun main() {
    var firstVar = "Hello "         // 문자열 역시 heap 영역에 저장되고 변수는 그 주소값을 저장
    var secondVar = "Kotlin"

    firstVar += secondVar           // 이렇게 하면 firstVar 은 기존의 "Kotlin"을 버리고
                                    // "Hello Kotlin" 이라는 새로운 문자열을 가리키게 됨 (가비지 컬렉터에서 Kotlin 처리)
    var res = ""
    var a = 1

    while (a <= 100) {              // 반복해서 원래 객체를 버리고 새로운 객체를 가리킴 (freezing 현상 발생가능)
        res += "$a"
        a++
        println(res)
    }
}