package chap02.section3

fun main() {
    var str1: String? = "Hello Kotlin"
    str1 = null
    println("str1: $str1 length: ${str1?.length}") // Safe Call
//    println("str1: $str1 length: ${str1!!.length}") // NULL이 아님을 단정짓고 컴파일러의 NULL CHECK를 무시
    val len = if(str1 != null) str1.length else -1
    println("len: $len")
}