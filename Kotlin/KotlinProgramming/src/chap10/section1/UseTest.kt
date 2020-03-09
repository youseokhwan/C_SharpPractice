package chap10.section1

import java.io.FileOutputStream
import java.io.PrintWriter

fun main() {
    PrintWriter(FileOutputStream("./UseTest.txt")).use {
        it.println("hello")
    }
}