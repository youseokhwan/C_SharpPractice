package chap07.section2

class Outer {
    val ov = 5

    /*
    Java의 경우 class 앞에 키워드가 생략되면 내부 클래스지만, Kotlin의 경우 중첩(정적) 클래스이다.
    Kotlin에서 내부 클래스를 사용하려면 inner 클래스를 붙여야 한다.
    중첩 클래스에서는 외부 클래스의 멤버에 접근할 수 없다. (companion object는 가능)
    반면, 이너 클래스에서는 외부 클래스의 멤버에 접근할 수 있다. (private 포함)
    */
    class Nested {
        val nv = 10
        fun greeting() = "[Nested] Hello ! $nv"
    }

    fun outside() {
        val msg = Nested().greeting() // 정적 클래스기 때문에 객체 생성없이 접근 가능
        println("[Outer]: $msg, ${Nested().nv}")
    }
}

fun main() {
    val output = Outer.Nested().greeting()
    println(output)

    // Outer.outside() // 오류! 외부 클래스의 경우 객체 생성 필요
    val outer = Outer()
    outer.outside()
}