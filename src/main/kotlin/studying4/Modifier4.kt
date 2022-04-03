package studying4

// 클래스 멤버의 접근 범위

open class Super {
    val publicData:Int = 100
    protected val protectedData:Int = 200
    private val privateData:Int = 300
}

class Sub:Super() {
    fun accessTest() {
        println("$publicData ...")
        println("$protectedData ...")  // protected 는 자신의 클래스 내에서 그리고 자식 클래스에서 접근이 가능
        // println("$privateData ...") // private 은 클래스 내부의 멤버에 지정하면 파일이 같더라도(상속 관계에 있어도) 접근 불가
    }
}

class Other {
    fun accessTest() {
        val myClass = Super()
        println("${myClass.publicData} ...")
        // println("${myClass.protectedData} ...")  // 자식 클래스가 아닌 외부 클래스에서 접근하려 하면 오류
        // println("${myClass.privateData} ...")    // 항상 클래스 내부의 private 은 해당 클래스 내부에서만 쓸 수 있다!
    }
}

// 접근 범위 넓은 순으로 : 1. public 2. protected / internal 3. private
// 코틀린에서 기본 접근 제한자는 public 이다.