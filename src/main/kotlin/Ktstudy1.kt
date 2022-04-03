// 정수 타입 : Byte(1) Short(2) Int(4) Long(8)
// 실수 타입 : Float, Double

fun main() {
    val a:Byte = 125
    val b:Short = (10 + 1000) * 10
    var cc:Int = 1_000_000_000         // _를 이용해 자릿수 구분 가능
    cc = 0xFF_AA_77                     // 0x 통해 16진수로 표현
    cc = 0b10101010_01110111            // 0b 통해 2진수로 표현
    var d:Long = 233_343_456_456_789

    cc = a + b                          // Byte + Short = Int (But Int + Int != Long)
    d = cc + 10L                        // 정수는 기본적으로 int 타입(long 형으로 만드려면 리터럴 뒤에 l or L 덧붙임)

    var ee:Float = 45.4f               // 실수는 기본적으로 double 타입(float 형으로 만드려면 리터럴 뒤에 f or F 덧붙임)
    val dd:Double = 45.34

    ee = (ee + dd).toFloat()
    println(ee)

    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f)
    println(0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f + 0.1f)    // 0.1f = 0.1000000014...
    println(0.1 * 10)
}