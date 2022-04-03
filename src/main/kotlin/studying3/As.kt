package studying3

// as 연산자를 이용한 다운 캐스팅
// 다운 캐스팅은 Upcasting 의 반대 개념이다.

open class Super {
    fun superFunc() {
        println("superFunc() 호출...")
    }
}

class Sub1:Super() {
    fun subFunc1() {
        println("subFunc1() 호출...")
    }
}

class Sub2:Super() {
    fun subFunc2() {
        println("subFunc2() 호출...")
    }
}

// as 사용 형식 : 객체 as 타입
// as를 이용한 캐스팅은 상속 관계에 있는 클래스끼리만 가능하다. 단, Upcasting 했던 객체를 다시 원래 타입으로 변환할 때만 사용 가능!
// (서브타입 -> 슈퍼타입 -> 서브타입)

fun main() {
    val obj1:Super = Sub1()                 // 하위 타입을 상위 타입으로 업캐스팅하고
    val obj2:Sub1 = obj1 as Sub1            // 다시 그 상위 타입을 하위 타입으로 as 하는 경우는 가능
                                            // 하 -> 상 -> 하 ==> OK!!
    obj2.superFunc()
    obj2.subFunc1()
/*
    val obj3:Sub1 = Super() as Sub1         // 상위 타입을 하위 타입으로 다운캐스팅하는 경우엔 안됨!
    obj3.subFunc1()                         // 상 -> 하 ==> NO!!

    val obj4:Sub2 = Sub1() as Sub2          // 서로 다른 클래스끼리도 as 불가
    obj4.subFunc2()
*/
    val obj5:Super? = Sub1()
    val obj6:Sub1 = obj5 as Sub1
    obj6.subFunc1()
/*
    val obj7:Super? = null
    val obj8:Sub1 = obj7 as Sub1            // 에러 발생(TypeCastException, NullPointerException)
    obj8.subFunc1()
*/
    val obj9:Super? = null
    val obj10:Sub1? = obj9 as? Sub1         // as? : Nullable 타입일 경우 null 값이 들어오면 null 반환
    println(obj10.toString())               // 정상적인 객체가 들어오면 정상적으로 캐스팅 함
}