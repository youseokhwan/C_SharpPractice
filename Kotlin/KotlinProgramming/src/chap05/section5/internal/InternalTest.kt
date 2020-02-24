package chap05.section5.internal

internal class InternalClass { // 같은 .jar 파일에 있으면 접근 가능
    internal var i = 1
    internal fun icFunc() {
        i += 1
    }
    fun access() {
        icFunc()
    }
}

class Other {
    internal val ic = InternalClass()
    fun test() {
        ic.i
        ic.icFunc()
    }
}

fun main() {
    val mic = InternalClass()
    mic.i
    mic.icFunc()
}