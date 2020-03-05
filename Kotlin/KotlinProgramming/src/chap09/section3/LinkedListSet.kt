package chap09.section3

fun main() {
    val intsLinkedListSet: java.util.LinkedHashSet<Int> = linkedSetOf(35, 21, 76, 26, 75)
    intsLinkedListSet.add(4)
    intsLinkedListSet.remove(21)

    println(intsLinkedListSet)
    intsLinkedListSet.clear()
    println(intsLinkedListSet)
}