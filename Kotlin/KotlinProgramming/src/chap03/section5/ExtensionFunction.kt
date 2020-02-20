package chap03.section5

fun main() {
    val source = "Hello World!"
    val target = "Kotlin"
    println(source.getLongString(target))
}

fun String.getLongString(target: String): String =
    if(this.length > target.length) this else target

// 확장 함수를 통해 기존 클래스에 메소드를 추가할 수 있다.
// 모든 클래스의 부모 클래스인 Any에 확장 함수를 추가하면 모든 클래스에서 사용할 수 있다.
// 만약 선언한 확장 함수와 동일한 멤버가 있다면 우선 순위에서 밀린다.