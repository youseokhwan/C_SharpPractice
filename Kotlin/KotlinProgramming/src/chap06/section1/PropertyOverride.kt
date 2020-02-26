package chap06.section1

open class First {
    open val x: Int = 0
        get() {
            println("First x")
            return field
        }
    val y: Int = 0
}

class Second : First() {
    override val x: Int = 0 // 프로퍼티를 override 해야 getter를 재정의할 수 있다
        get() {
            println("Second x")
            return field + 3
        }
}

fun main() {
    val second = Second()
    println(second.x)
    println(second.y)
}