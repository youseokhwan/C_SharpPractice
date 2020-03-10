package chap11.section2

val fibonacciSeq = sequence {
    var a = 0
    var b = 1
    yield(1) // 1. 지연 함수 사용

    while(true) {
        yield(a + b) // 2.
        val tmp = a + b
        a = b
        b = tmp
    }
}

fun main() {
    println(fibonacciSeq.take(8).toList()) // 8개의 값 획득
}