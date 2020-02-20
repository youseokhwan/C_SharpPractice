package chap03.section5.localreturn

fun main() {
    shortFunc(3) {
        println("First call: $it")
        return // 비지역 반환. 람다에서 return이 사용되었지만 inline으로 인해 의도치않게 shortFunc()에서 return 실행됨
    }
}

inline fun shortFunc(a: Int, out: (Int) -> Unit) {
    println("Before calling out()")
    out(a)
    println("After calling out()")
}