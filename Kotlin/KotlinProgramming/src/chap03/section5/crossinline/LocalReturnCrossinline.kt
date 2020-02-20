package chap03.section5.crossinline

fun main() {
    shortFunc(3) {
        println("First call: $it")
    }
}

inline fun shortFunc(a: Int, crossinline out: (Int) -> Unit) {
    println("Before calling out()")
    nestedFunc { out(a) } // 중첩시켜 문맥을 달리하면 개발 단계에서 비지역 반환 로직 에러를 방지할 수 있다.
    println("After calling out()")
}

fun nestedFunc(body: () -> Unit) {
    body()
}