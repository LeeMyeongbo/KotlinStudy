package studying4

// 상속관계와 접근제한자(open, private...)
// open 과 private 은 함께 사용 불가

open class Super2 {
//    open private fun myFunc() {       // 말도 안되는 거 (자식 클래스에서 오버라이딩 하려면 기본적으로 접근이 가능해야 함)
//
//    }
    open fun myFunc2() {}

    protected open fun myFunc3() {}
}

class Sub2:Super2() {
    // private override fun myFunc2() {}    // 상위의 접근제한 범위를 줄여서 하위에서 오버라이드 할 수는 없다.

    override fun myFunc3() {}           // 상위의 접근제한 범위를 넓혀서 하위에서 오버라이드를 할 수는 있다.
}