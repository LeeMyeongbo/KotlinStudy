package studying

class Student (var name: String, var birthday: String, var gender: String) {

    // 멤버 함수 : 클래스에 내장된 함수를 의미
    fun printStudentInfo() {
        println("이름 : " + this.name)
        println("생일 : " + this.birthday)
        println("성별 : " + this.gender)
    }
    // 위의 프로퍼티와 멤버 함수를 Student 의 멤버라고 한다.
}

fun main() {
    val student = Student("고길똥", "90/10/10", "남")
        student.printStudentInfo()
}