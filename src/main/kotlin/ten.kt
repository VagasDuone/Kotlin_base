package org.example

//Program13: Реализовать обратный отсчет до старта, пользователь вводит число. Должна быть проверка.
import kotlin.system.exitProcess

fun main() {
    println("Введите число, от которого будет вестись обратный отсчет:")
    val num = readLine()!!.toInt()

    if (num < 0) {
        print("Неверный ввод! Пожалуйста, введите целое положительное число.")
        exitProcess(1)
    }

    for (i in num downTo 1) {
        println(i)
        Thread.sleep(10) // pause for 1 second
    }

    println("ГАГАРИН - ПОЕХАЛИ!")
}

