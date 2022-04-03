package studying4

// 주생성자, 보조생성자에도 접근 제한자 사용 가능 (단, protected 제한자는 불가)
// 생성자의 기본 접근제한자는 public 이다.
// 주 생성자에 접근제한자를 지정하려면 constructor 키워드를 생략하지 않고 그 앞에 지정하면 됨

class ConstructorClass private constructor(val name:String) {   // 이러면 ConstructorClass 내부에서만 객체 생성이 가능
     public constructor(name:String, id:Int):this(name) {

     }
}