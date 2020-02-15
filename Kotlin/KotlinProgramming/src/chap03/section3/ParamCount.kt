package chap03.section3

fun main() {
    noParam({ "Hello World!" })
    noParam { "Hello World!" } // 소괄호 생략 가능

    oneParam({ a -> "Hello World! $a" })
    oneParam { a -> "Hello World! $a" }
    oneParam { "Hello World! $it" }

    moreParam { a, b -> "Hello World! $a $b" } // 매개변수 이름 생략 불가
    moreParam { _, b -> "Hello World! $b" }
}

fun noParam(out: () -> String) = println(out())

fun oneParam(out: (String) -> String) {
    println(out("OneParam"))
}

fun moreParam(out: (String, String) -> String) {
    println(out("OneParam", "TwoParam"))
}