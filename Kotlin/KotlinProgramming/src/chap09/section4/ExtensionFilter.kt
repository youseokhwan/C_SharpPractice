package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listMixed = listOf(1, "Hello", 3, "World", 5, 'A')
    val listWithNull = listOf(1, null, 3, null, 5, 6)
    val listRepeated = listOf(2, 2, 3, 4, 5, 5, 6)
    val map = mapOf(11 to "Java", 22 to "Kotlin", 33 to "C++")

    // filter: 식에 따라 요소 골라내기
    println(list.filter { it % 2 == 0 }) // 짝수 골라내기
    println(list.filterNot { it % 2 == 0 }) // 짝수가 아닌 것 골라내기
    println(listWithNull.filterNotNull()) // null 제외

    // filterIndexed: 인덱스와 함께 추출
    println("filterIndexed: " + list.filterIndexed { idx, value -> idx != 1 && value % 2 == 0 })

    // filterIndexedTo: 추출 후 가변형 컬렉션으로 변환
    val mutList = list.filterIndexedTo(mutableListOf()) { idx, value -> idx != 1 && value % 2 == 0 }
    println("filterIndexedTo: $mutList")

    // filterKeys, filterValues: 키 또는 값에 따라 추출
    println("filterKeys: " + map.filterKeys { it != 11 })
    println("filterValues: " + map.filterValues { it == "Java" })

    // filterIsInstance: 원하는 자료형 골라내기
    println("filterIsInstance: " + listMixed.filterIsInstance<String>())

    // slice: 특정 인덱스의 요소들을 잘라서 반환
    println("slice: " + list.slice(listOf(0, 1, 2)))

    // take: n개의 List 반환
    println(list.take(2)) // 처음 두 요소 반환
    println(list.takeLast(2)) // 마지막 두 요소 반환
    println(list.takeWhile { it < 3 }) // 조건식에 따른 반환

    // drop: n개를 제외한 List 반환
    println(list.drop(3)) // 처음 세 요소 제외하고 반환
    println(list.dropWhile { it < 3 }) // 3 미만을 제외하고 반환
    println(list.dropLastWhile { it > 3 }) // 3 초과를 제외하고 반환

    // componentN: 각 요소를 1부터 대응(0이 아닌 1부터 시작함에 유의)
    println("component1(): " + list.component1())

    // distinct: 합집합 List 반환
    println("distinct: " + listRepeated.distinct())

    // intersect: 교집합 List 반환
    println("intersect: " + list.intersect(listOf(5, 6, 7, 8)))
}