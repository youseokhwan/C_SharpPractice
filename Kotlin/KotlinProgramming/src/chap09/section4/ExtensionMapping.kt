package chap09.section4

// map 관련 확장 함수는 forEach와 비슷하지만
// 원본 컬렉션을 건드리지 않고 새로운 컬렉션을 반환한다.
fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listWithNull = listOf(1, null, 3, null, 5, 6)

    // map: 컬렉션에 주어진 식을 적용해 새로운 컬렉션 반환
    println(list.map { it * 2 })

    // mapIndexed: 인덱스 포함
    val mapIndexed = list.mapIndexed { index, it -> index * it }
    println(mapIndexed)

    // mapNotNull: null 제외
    println(listWithNull.mapNotNull { it?.times(2) })

    // flatMap: 각 요소에 식을 적용한 후 다시 합쳐서 새로운 컬렉션 반환
    println(list.flatMap { listOf(it, 'A') })
    val result = listOf("abc", "12").flatMap { it.toList() }
    println(result)

    // groupBy: 주어진 식에 따라 요소를 그룹화하여 Map으로 반환
    val grpMap = list.groupBy { if(it % 2 == 0) "even" else "odd" }
    println(grpMap)
}