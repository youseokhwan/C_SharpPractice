package chap06.section2

import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("NONAME") { // 1. 프로퍼티 위임
        prop, old, new -> // 람다식 매개변수
        println("$old -> $new") // 이벤트가 발생할 때만 실행
    }
}

fun main() {
    val user = User()
    user.name = "Kildong"
    user.name = "Dooly"
}