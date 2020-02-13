package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length ?: -1}") // Elvis 연산자를 이용해 null일 경우 오른쪽 구문 실행
}