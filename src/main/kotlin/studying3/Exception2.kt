package studying3

// 예외 처리 구문
/*
    try {
        // 실행 코드
    } catch (e:Exception) {
        // 예외 발생 시 처리할 코드
    } finally {
        // finally 동작(예외 발생하든 말든 반드시 처리할 코드)
    }

    예외처리 변수에 적용
    var result = try {
        // 실행 코드
    } catch(e:Exception) {
        // 예외 시 처리 코드
    }
    catch 블록은 여러 개 두어서 사용할 수 있음. (여러개의 예외 객체가 발생해서 각각 다른 동작으로 실행)
*/

fun main() {
    try {
        val str = "abcdef"
        val num = str.toInt()

        println(num)
    } catch (e:ArrayIndexOutOfBoundsException) {
        println("배열의 인덱스 범위를 초과했습니다.")
    } catch (e:NumberFormatException){
        println("숫자로 이루어진 문자열이 아님. 변환 불가")
    } finally {
        println("반드시 실행되는 부분")
    }
}