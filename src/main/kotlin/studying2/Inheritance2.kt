package studying2

// 클래스 없이 특정한 클래스를 상속받는 객체 만들기
open class ParentClass(val name:String, val age:Int) {
    open fun output() {
        println("이름 : $name")
        println("나이 : $age")
    }
}

fun main() {
    // childClass : ParentClass 상속받는 객체
    val childClass:ParentClass = object:ParentClass("고길똥", 33) {
        override fun output() {
            println("ParentClass 를 오버라이딩한 함수")
        }
    }
    childClass.output()
}