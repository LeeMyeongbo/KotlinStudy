package studying3

fun main() {
    var aa:String? = "고길똥"
    var len:Int = if (aa != null) aa.length else -1
    println(len)

    aa = null
    len = aa?.length ?: -1
    println(len)

    aa ?: println("aa는 null 입니다.")
}