package chap11.section2

import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//fun main() = runBlocking<Unit> {
suspend fun main() = coroutineScope { // 코틀린 1.3 이후
    launch {
        delay(1000L)
        println("World!")
    }
    println("Hello")
    // main 함수가 runBlocking 모드에서 실행되기 때문에 코루틴이 끝날 때까지 기다린다.
}