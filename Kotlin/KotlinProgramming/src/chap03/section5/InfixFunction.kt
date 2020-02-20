package chap03.section5

fun main() {
    // 일반 표현법
    var multi = 3.multiply(10)
    println("multi: $multi")

    // 중위 표현법
    multi = 3 multiply 10 // 일종의 연산자라고도 볼 수 있음
    println("multi: $multi")
}

infix fun Int.multiply(x: Int): Int {
    return this * x
}