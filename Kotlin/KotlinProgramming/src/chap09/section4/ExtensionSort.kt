package chap09.section4

fun main() {
    val unsortedList = listOf(3, 2, 7, 5)

    // reversed
    println(unsortedList.reversed())

    // sorted
    println(unsortedList.sorted())

    // sortedDescending: 내림차순 정렬
    println(unsortedList.sortedDescending())

    // sortedBy: 특정 비교식에 의해 정렬된 컬렉션 반환
    println(unsortedList.sortedBy { it % 3 })
    println(unsortedList.sortedByDescending { it % 3 })
}