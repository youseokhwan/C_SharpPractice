package chap06.section2

import kotlin.properties.Delegates

fun main() {
    var max: Int by Delegates.vetoable(0) {
        prop, old, new ->
        new > old // 조건에 맞지 않으면 거부
    }

    println(max)
    max = 10
    println(max)

    max = 5 // 거부
    println(max)
}