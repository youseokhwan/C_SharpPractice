package chap04.section3

import java.lang.Exception
import kotlin.reflect.jvm.internal.impl.descriptors.impl.AbstractReceiverParameterDescriptor

fun main() {
    var amount = 600

    try {
        amount -= 100
        checkAmount(amount)
    } catch(e: Exception) {
        println(e.message)
    }
}

fun checkAmount(amount: Int) {
    if(amount < 1000)
        throw Exception("잔고가 ${amount}으로 1000 이하입니다.")
}