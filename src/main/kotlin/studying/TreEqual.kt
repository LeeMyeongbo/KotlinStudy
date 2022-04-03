package studying

// ===, !== : 두 참조변수가 같은 객체를 가리키고 있는지 여부를 조사
// ==(자바의 equals), !=

fun main() {
    var a = "first"
    var b = "first"

    println(a === b)        // 두 참조변수가 같은 객체를 참조할 경우 true 반환 (이 경우는 같은 문자열이므로 굳이 공간을 더 쓰지 않음)

    b = "fir"
    b += "st"
    println(a === b)        // 이 경우는 a와 b가 서로 다른 "first"를 가리키게 됨 -> false

    b = a                   // a값(주소값)을 b에 복사하게 됨 -> a와 b가 같은 "first"를 가리키게 됨
    println(a === b)
}