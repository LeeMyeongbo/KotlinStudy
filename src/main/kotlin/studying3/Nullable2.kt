package studying3

var data1:String = "고길똥"
var data2:String? = null

fun myFunc(arg:String) {

}

fun main() {
    data2 = "고길똥막대기"
    val data3:String? = data2
    // val data4:String = data2      // data4 가 String 타입인데 data2 는 String? 타입이므로 호환 안됨

    // myFunc(data2)                 // 마찬가지
}