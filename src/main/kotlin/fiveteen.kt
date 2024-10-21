package org.example

import kotlin.system.exitProcess

fun main() {
    println("Введите число:")
    val num = readLine()!!.toInt()

    if (num <= 0) {
        println("Ошибка ввода! Пожалуйста, введите положительное целое число.")
        exitProcess(1)
    }

    if (num % 2 == 0) {
        println("$num - это четное число")
    } else {
        println("$num - это нечетное число")
    }
}
