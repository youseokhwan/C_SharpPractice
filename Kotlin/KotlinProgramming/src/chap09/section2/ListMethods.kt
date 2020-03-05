package chap09.section2

fun main() {
    val names: List<String> = listOf("one", "two", "three")

    println(names.size)
    println(names.get(0))
    println(names.indexOf("three")) // index 반환
    println(names.contains("two")) // boolean 반환
}