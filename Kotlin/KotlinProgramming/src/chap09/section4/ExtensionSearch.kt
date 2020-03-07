package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100), Pair("D", 200))
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)

    // elementAt: 인덱스에 해당하는 요소 반환
    println("elementAt: " + list.elementAt(1))

    // elementAtOrElse: 인덱스를 벗어나는 경우 로직 처리
    println("elementAtOrElse: " + list.elementAtOrElse(10) { 2 * it })

    // elementAtOrNull: 인덱스를 벗어나는 경우 null 반환
    println("elementAtOrNull: " + list.elementAtOrNull(10))

    // first, last: 식에 일치하는 처음 또는 마지막 요소 반환
    println("first: " + listPair.first { it.second == 200 })
    println("last: " + listPair.last { it.second == 200 })

    // firstOrNull, lastOrNull: 식에 일치하지 않는 경우 null 반환
    println("firstOrNull: " + listPair.firstOrNull { it.first == "E" })
    println("lastOrNull: " + listPair.firstOrNull { it.first == "E" })

    // indexOf, lastIndexOf: 주어진 요소에 일치하는 처음 또는 마지막 인덱스 반환
    println("indexOf: " + list.indexOf(4))
    println("lastIndexOf: " + listRepeated.lastIndexOf(5))

    // indexOfFirst, indexOfLast: 람다식에 일치하는 처음 또는 마지막 요소 인덱스 반환, 없으면 -1
    println("indexOfFirst: " + list.indexOfFirst { it % 2 == 0 })
    println("indexOfLast: " + list.indexOfLast { it % 2 == 0 })

    // single: 람다식에 일치하는 요소 1개 반환
    println("single: " + listPair.single { it.second == 100 }) // 일치하는 요소가 없거나 여러 개면 Exception
    println("singleOrNull: " + listPair.singleOrNull { it.second == 500 }) // 일치하는 요소가 없거나 여러 개면 null 반환

    // binarySearch: 이진 탐색 후 인덱스 반환
    println("binarySearch: " + list.binarySearch(3))

    // find: 조건식을 만족하는 첫 번째 요소 반환, 없으면 null
    println("find: " + list.find { it > 3 })
}