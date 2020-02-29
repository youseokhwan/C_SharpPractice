package chap07.section2

sealed class Result {
    open class Success(val message: String) : Result()
    class Error(val code: Int, val message: String) : Result()
}

// sealed 클래스는 같은 파일에서만 상속 가능하고, 형식 지정자는 무조건 private
class Status : Result()
class Inside: Result.Success("Status")

fun main() {
    val result = Result.Success("Good!")
    val msg = eval(result)
    println(msg)
}

fun eval(result: Result): String = when(result) {
    is Status -> "in progress"
    is Result.Success -> result.message
    is Result.Error -> result.message
}