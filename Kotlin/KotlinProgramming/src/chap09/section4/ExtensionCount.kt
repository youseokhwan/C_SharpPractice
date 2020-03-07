package chap09.section4

fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    val listPair = listOf(Pair("A", 300), Pair("B", 200), Pair("C", 100))
    val map = mapOf(1 to "Java", 22 to "Kotlin", 33 to "C++")

    // forEach: 요소의 순환
    list.forEach { print("$it ") }
    println()
    list.forEachIndexed { index, value -> println("index[$index]: $value") }

    // onEach: 각 요소를 람다식으로 처리 후 컬렉션 반환
    val returnedList = list.onEach { print(it) }
    println()
    val returnedMap = map.onEach { println("key: ${it.key}, value: ${it.value}") }
    println("returnedList = $returnedList")
    println("returnedMap = $returnedMap")

    // count, max, min, maxBy, minBy
    println(list.count { it % 2 == 0 })
    println(list.max())
    println(list.min())
    println("maxBy: " + map.maxBy { it.key }) // 키를 기준으로 최댓값
    println("minBy: " + map.minBy { it.key }) // 키를 기준으로 최솟값

    // fold, foldRight: 순환하며 초깃값과 함께 식 적용
    println(list.fold(4) { total, next -> total + next })
    println(list.fold(1) { total, next -> total * next })

    // reduce, reduceRight: fold와 동일하지만 초깃값 X
    println(list.reduce { total, next -> total + next })
    println(list.reduceRight { total, next -> total * next })

    // sumBy: 식에 의해 도출된 모든 요소 합산
    println(listPair.sumBy { it.second })
}