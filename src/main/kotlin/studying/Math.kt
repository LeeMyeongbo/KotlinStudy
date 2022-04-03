// package 선언문 : 이 소스파일이 studying 패키지 안에 있음을 의미함
package studying

fun max(a:Int, b:Int):Int = if (a > b) a else b

fun min(a:Int, b:Int):Int = if (a > b) b else a

fun abs(num:Int):Int = if (num > 0) num else -num