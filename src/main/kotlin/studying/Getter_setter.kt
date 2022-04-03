package studying

class Human2 {
    var age:Int = 0
        // age 프로퍼티의 getter : age 값을 읽어올 때 자동으로 호출
        get() {
            return field    // age 에 저장되는 값을 나타내는 식별자. 특수식별자(수정 불가)
        }
        // age 프로퍼티의 setter : age 에 값을 저장할 때 자동으로 호출 (val 타입에서는 사용 불가)
        set(value) {        // value : age 에 저장하려는 값을 의미 (value 의 타입은 age 의 타입과 일치하므로 생략가능)
            field = if (value >= 0) value else 0
        }
    // val 프로퍼티는 getter 만 존재 (초기값이 주어지면 더 이상 값을 변경(set)할 수 없기 때문

    // getter 와 setter 를 별도로 지정하지 않으면 다음과 같이 자동으로 지정됨
    var id:Int = 0
        // 지정하지 않을 경우 자동으로 생성되는 코드
        /* 디폴트 Getter/Setter. 커스터마이징할 때 별도로 정의해 주면 됨.
        get() {
            return field
        }
        set(value) {
            field = value
        }
        */
}