package studying2

// 오버라이딩 : 슈퍼클래스의 멤버함수를 서브클래스에서 고쳐서 사용하는 것(덮어쓰기)
// 코틀린에서는 오버라이딩을 하는 경우 반드시 override 키워드를 붙여야 한다.

open class DemoA {          // 슈퍼 클래스 DemoA
    // 클래스와 마찬가지로 멤버 함수도 상속을 허용하려면 open 키워드 붙여야 함
    open fun demoFunc() = println("demoAFunc 함수...")
}

open class DemoB:DemoA() {          // DemoA 를 상속받는 서브 클래스 DemoB
    override fun demoFunc() {       // 만약 이후 자식 클래스가 오버라이딩을 못하게 하려면 final 키워드를 맨 앞에 붙이면 됨
        super.demoFunc()            // super 는 슈퍼클래스를 의미하는 대명사
        println("demoBFunc 함수...")
    }
}

class DemoC:DemoB() {
    override fun demoFunc() {       // override 에는 기본적으로 open 키워드가 포함되어 있음!
        super.demoFunc()
        println("demoCFunc 함수...")
    }
}

fun main() {
    DemoA().demoFunc()
    DemoB().demoFunc()
    DemoC().demoFunc()
}