package chap06.section1

//class User(_id: Int, _name: String, _age: Int) {
//    val id: Int = _id
//    var name: String = _name
//    var age: Int = _age
//}
// 다음과 같이 축약 가능

class User(val id: Int, var name: String, var age: Int)

fun main() {
    val user = User(1, "Sean", 30)
    val name = user.name
    user.age = 41
    println("name: $name, ${user.age}")
}