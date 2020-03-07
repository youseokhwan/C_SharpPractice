package chap09.section4

fun main() {
    val list1 = listOf(1, 2, 3, 4, 5, 6)
    val list2 = listOf(2, 2, 3, 4, 5, 5, 6, 7)

    // union: 두 List를 합쳐서 Set 반환(중복 요소는 하나만)
    println(list1.union(list2))

    // plus: 두 List를 합쳐서 List 반환(중복 요소 포함)
    println(list1.plus(list2))

    // partition: 주어진 식에 따라 true 그룹과 false 그룹으로 나뉜 Pair 반환
    val part = list1.partition { it % 2 == 0 }
    println(part)

    // zip: 동일 인덱스끼리 Pair를 만들어 반환
    val zip = list1.zip(listOf(7, 8))
    println(zip)
}