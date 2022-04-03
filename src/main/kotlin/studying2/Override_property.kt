package studying2

// Getter/Setter 도 오버라이딩 가능

open class Parent {
    open var aa = 10
        get() {
            println("Parent aa Getter 호출...")
            return field
        }
        set(value) {
            println("Parent aa Setter 호출...")
            field = value
        }
}

class Child:Parent() {
    override var aa:Int
        get() {
            println("Child bb Getter 호출...")
            return super.aa
        }
        set(value) {
            println("Child bb Setter 호출...")
            super.aa = value
        }
}

fun main() {
    val child = Child()
    child.aa = 100
    println(child.aa)
}