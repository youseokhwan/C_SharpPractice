package chap09.section2

fun main() {
    // 불변형 List
    // 자바는 컬렉션이 가변형이지만, 코틀린은 가변형과 불변형으로 나눈다.
    // 코틀린에서는 직접 생성하지 않고 헬퍼 함수를 통해 생성한다.
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    val names: List<String> = listOf("one", "two", "three")

    for(name in names) {
        println(name)
    }

    for(num in numbers) {
        print(num)
    }
}