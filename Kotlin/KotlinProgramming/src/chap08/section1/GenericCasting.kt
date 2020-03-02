package chap08.section1

open class Parent

class Child : Parent()

class Cup<T>

fun main() {
    val obj1: Parent = Child() // Parent 형식의 obj1은 Child의 자료형으로 변환될 수 있음
//    val obj2: Child = Parent() // 오류

//    val obj3: Cup<Parent> = Cup<Child>() // 오류
//    val obj4: Cup<Child> = Cup<Parent>() // 오류, 제네릭은 상속 관계없이 다른 type으로 인식

    val obj5 =  Cup<Child>()
    val obj6: Cup<Child> = obj5
}