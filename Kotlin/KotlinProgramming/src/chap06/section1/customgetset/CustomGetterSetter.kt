package chap06.section1.customgetset

class User(_id: Int, _name: String, _age: Int) {
    val id: Int = _id
    var name: String = _name
        set(value) {
            println("The name was changed")
            field = value.toUpperCase()
        }
    var age: Int = _age
}

fun main() {
    val user = User(1, "Kildong", 30)
    user.name = "coco"
    println("user.name = ${user.name}")
}