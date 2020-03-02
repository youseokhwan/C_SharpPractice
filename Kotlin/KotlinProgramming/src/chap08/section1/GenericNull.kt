package chap08.section1

class GenericNull<T> { // 기본적으로 Nullable이며 원치 않으면 <T: Any>로 선언
    fun EqualityFunc(arg1: T, arg2: T) {
        println(arg1?.equals(arg2))
    }
}

fun main() {
    val obj = GenericNull<String>()
    obj.EqualityFunc("Hello", "World")

    val obj2 = GenericNull<Int?>()
    obj2.EqualityFunc(null, 10)
}