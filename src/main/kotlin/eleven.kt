package org.example
//Program11: принимает на вход целое число от 1 до 7 и выводит на экран день недели:
import kotlin.system.exitProcess

fun main() {
    println("Введите число от 1 до 7:")
    val num = readLine()!!.toInt()

    if (num < 1 || num > 7) {
        println("Неверный ввод! Пожалуйста, введите число от 1 до 7.")
        exitProcess(1)
    }

    when (num) {
        1 -> println("Понедельник")
        2 -> println("Вторник")
        3 -> println("Среда")
        4 -> println("Четверг")
        5 -> println("Пятница")
        6 -> println("Суббота")
        7 -> println("Воскресенье")
    }
}