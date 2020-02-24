package chap05.section5.privatetest

private class PrivateClass {
    private var i = 1
    private fun privateFunc() {
        i += 1
    }
    fun access() {
        privateFunc()
    }
}

class OtherClass {
//    val opc = PrivateClass() // 프로퍼티 opc는 private 가시성 지시자를 가져야 함
    fun test() {
        val pc = PrivateClass()
    }
}

fun main() {
    val pc = PrivateClass()
//    pc.i // 접근 불가
//    pc.privateFunc() // 접근 불가
}

fun TopFunction() {
    val tpc = PrivateClass()
}