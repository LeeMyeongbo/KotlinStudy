package studying4

class AccessPropertyTest2 {
    // 아래의 data 프로퍼티는 접근제한자가 없음. 따라서, public 으로 지정된 거. -> get()도 public 이 적용 (set()은 private)
    // 결론적으로 data 프로퍼티에는 값을 불러올 수 있어도 변경은 할 수 없다
    var data:Int = 100
        private set(value) {
            field = value
        }
}

fun main() {
    val obj = AccessPropertyTest2()
    println("${obj.data} ...")      // getter 가 public 이기 때문에 읽기 가능
    // obj.data = 200               // setter 가 private 이기 때문에 외부에서 변경 불가
}

// get() 함수(getter)는 프로퍼티의 접근제한자와 항상 같다.
// set() 함수(setter)는 프로퍼티의 접근제한자와 다르게 설정할 수 있다. (단, 접근 범위를 넓혀서 설정할 수는 없다.)
// 예)   private val data:Int = 100 -> 이 경우 setter 는 public 이 허용 안됨
//       val data:Int = 100 -> 이 경우 setter 는 private 선언이 가능
//       protected val data:Int = 100 -> 이 경우 setter 는 private, protected 가능