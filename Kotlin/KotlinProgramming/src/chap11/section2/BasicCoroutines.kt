package chap11.section2

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

fun main() {
    GlobalScope.launch {
        // delay처럼 suspend로 선언된 함수만 coroutine 기능을 사용할 수 있다. (일시정지, 재개 등)
        delay(1000L)
        println("World!") // 1초 후 지연 출력
    }
    println("Hello, ")
    Thread.sleep(2000L)
//    delay(1000L) // main 함수는 메인 쓰레드로 사용되는데,
                   // suspend 함수들은 메인 쓰레드에서는 사용할 수 없다.
}