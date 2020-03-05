package chap09.section2

fun main() {
    // 가변형 List의 생성 및 추가, 삭제, 변경
    val mutableList: MutableList<String> = mutableListOf<String>("Kildong", "Dooly", "Chelsu")

    mutableList.add("Ben")
    mutableList.removeAt(1)
    mutableList[0] = "Sean"
    println(mutableList)

    val mutableListMixed = mutableListOf("Android", "Apple", 5, 6, 'x')
    println(mutableListMixed)
}