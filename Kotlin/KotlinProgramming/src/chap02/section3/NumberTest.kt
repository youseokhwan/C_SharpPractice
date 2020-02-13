package chap02.section3

fun main() {
    var test: Number = 12.2 // Float으로 Smart Cast
    println("$test")

    test = 12 // Int로 Smart Cast
    println("$test")

    test = 120L // Long으로 Smart Cast
    println("$test")

    test += 12.0f // Float으로 Smart Cast
    println("$test")
}