package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // all: 모든 요소가 일치해야 true
    println(list.all { it < 10 })
    println(list.all { it % 2 == 0 })

    // any: 하나의 요소만 일치해도 true
    println(list.any { it % 2 == 0 })
    println(list.any { it > 10 })

    // contains: 포함 여부
    println("contains: " + list.contains(2))
    println(2 in list)
    println(map.contains(11))
    println(11 in map)

    // containsAll: 모든 요소가 포함돼있는지 여부
    println("containsAll: " + list.containsAll(listOf(1, 2, 3)))

    // none: 요소가 없으면 true
    println("none: " + list.none())
    println("none: " + list.none { it > 6 })

    // isEmpty, isNotEmpty: 컬렉션이 비어있는지 여부
    println(list.isEmpty())
    println(list.isNotEmpty())
}