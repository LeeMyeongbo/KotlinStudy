fun main() {
    var aa = 10
    var bb = 20

    if (aa > bb) {
        println("조건이 참입니다")
        bb -= aa            // bb = bb - aa
    } else {
        println("조건이 거짓이빈다")
        aa += bb
    }
    if (aa == bb)
        println("wow!!")

    println(bb)
    println(aa)
}