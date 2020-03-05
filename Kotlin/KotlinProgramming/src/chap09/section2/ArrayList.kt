package chap09.section2

fun main() {
    // 가변형 List는 Java의 ArrayList로 반환된다.
    val stringList: ArrayList<String> = arrayListOf<String>("Hello", "Kotlin", "Wow")

    stringList.add("Java")
    stringList.remove("Hello")
    println(stringList)
}