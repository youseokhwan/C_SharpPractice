package chap02.section3

fun main() {
    var a: Any = 1 // Any는 Java의 Object와 비슷하나 같지는 않다.
    a = 20L
    println("a: $a type: ${a.javaClass}")
}