package chap09.section5

// 시퀀스: 순차적인 컬렉션으로 요소의 크기를 특정하지 않고, 나중에 결정할 수 있는 특수한 컬렉션
// ex) 특정 파일에서 줄 단위로 읽는 경우
fun main() {
    // 시드값 1을 시작으로 1씩 증가하는 시퀀스
    val nums: Sequence<Int> = generateSequence(1) { it + 1 }

    // take()를 사용해 원하는 요소 개수만큼 획득하고 리스트로 변환
    println(nums.take(10).toList())

    // map
    val squares = generateSequence(1) { it + 1 }.map {it * it}
    println(squares.take(10).toList())

    // filter
    val oddSquares = squares.filter { it % 2 != 0 }
    println(oddSquares.take(5).toList())
}