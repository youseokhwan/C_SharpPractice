package chap03.section1

fun main() {
    normalVarargs(1, 2, 3, 4)
    normalVarargs(4, 5, 6)
}

fun normalVarargs(vararg counts: Int) { // 가변 인자
    for(num in counts) {
        print("$num ")
    }
    print("\n")
}