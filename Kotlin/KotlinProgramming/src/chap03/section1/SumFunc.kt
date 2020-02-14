package chap03.section1

//fun sum(a: Int, b: Int): Int { // 반환형의 자료형 반드시 명시해야 함
//    var sum = a + b
//    return sum
//}

fun sum(a: Int, b: Int): Int = a + b // 코드 단축 가능(반환형 Int 키워드도 생략 가능)

fun main() {
    val result1: Int = sum(3, 2)
    val result2: Int = sum(6, 7)

    println(result1)
    println(result2)
}