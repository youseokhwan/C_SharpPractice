package chap09.section3

fun main() {
    val animals = mutableSetOf("Lion", "Dog", "Cat", "Python", "Hippo")
    println(animals)

    animals.add("Dog") // Set은 값이 Unique하기 때문에 추가해도 변화가 없다.
    println(animals)

    animals.remove("Python")
    println(animals)
}