package chap03.section3

fun main() {
    val result: Int
    val multi = { // 일반 변수에 람다식 할당
        x: Int, y: Int ->
        x * y // 마지막 표현식이 반환됨
    }

    result = multi(10, 20)
    println(result)
}