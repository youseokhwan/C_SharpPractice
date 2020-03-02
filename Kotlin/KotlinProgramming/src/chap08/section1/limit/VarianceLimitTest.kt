package chap08.section1.limit

open class Animal(val size: Int) {
    fun feed() = println("Feeding...")
}

class Cat(val jump: Int): Animal(50)
class Spider(val poison: Boolean): Animal(1)

// 1. 형식 매개변수를 Animal로 제한
class Box<out T: Animal>(val element: T) {
    fun getAnimal(): T = element // out은 반환 자료형에만 사용할 수 있음
//    fun set(new: T) { // 오류, T는 in 위치에 쓸 수 없음
//        element = new
//    }
}

fun main() {
    val c1: Cat = Cat(10)
    val s1: Spider = Spider(true)

    var a1: Animal = c1
    a1 = s1
    println("a1.size = ${a1.size}")

    val c2: Box<Animal> = Box<Cat>(Cat(10)) // 공변성
    println("c2.element.size = ${c2.element.size}")

//    val c3: Box<Cat> = Box<Animal>(10) // 오류, 반대의 경우는 인스턴스화 불가
//    val c4: Box<Any> = Box<Int>(10) // 오류, Animal과 하위 클래스 이외에는 사용 불가
}