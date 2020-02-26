package chap06.section1

class User2(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
        get() = field

    var name: String = _name
        get() = field
        set(value) {
            field = value
        }

    var age: Int = _age
        get() = field
        set(value) {
            field = value
        }
}

fun main() {
    val user2 = User2(1, "Kildong", 30)
    // user2.id = 2
    user2.age = 35
    println("user2.age = ${user2.age}")
}