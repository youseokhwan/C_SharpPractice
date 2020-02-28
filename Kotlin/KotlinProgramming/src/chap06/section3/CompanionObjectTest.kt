package chap06.section3

class Person {
    var id: Int = 0
    var name: String = "Youngdeok"
    companion object { // 코틀린은 static 대신 companion object 제공
        var language: String = "Korean"
        fun work() {
            println("working...")
        }
    }
}

fun main() {
    println(Person.language)
    Person.language = "English"
    println(Person.language)
    Person.work()
}