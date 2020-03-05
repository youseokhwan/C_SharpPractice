package chap09.section2

fun main() {
    val fruits = listOf("apple", "banana", "kiwi")

    for(item in fruits) {
        println(item)
    }

    for(index in fruits.indices) {
        println("fruits[$index] = ${fruits[index]}")
    }

    for(index in fruits.indices) {
        if(index % 2 == 0) println("fruits[$index] = ${fruits[index]}")
    }
}