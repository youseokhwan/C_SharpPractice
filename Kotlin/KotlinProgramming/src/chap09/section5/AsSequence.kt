package chap09.section5

fun main() {
    // 메서드 체이닝을 사용하여 연산하면 중간 결과가 생성되어 비용이 증가함
    val list1 = listOf(1, 2, 3, 4, 5)
    val listDefault = list1
        .map { println("map($it) "); it * it }
        .filter { println("filter($it) "); it % 2 == 0 }
    println(listDefault)

    // asSequence()를 사용하여 병렬 처리
    val listSeq = list1.asSequence()
        .map { print("map($it) "); it * it }
        .filter { println("filter($it) "); it % 2 == 0 }
        .toList()
    println(listSeq)
}