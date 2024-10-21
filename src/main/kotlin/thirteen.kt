package org.example
//Program14: вводится число, после него вводится число элементов массива.
// Программа создаёт массив из этих чисел и проверяет,
// содержится ли в нем заданное число. Если число есть - выведите в консоль true, иначе - false
import kotlin.system.exitProcess
    fun main() {
        println("Введите число:")
        val num = readLine()!!.toInt()

        if (num <= 0) {
            println("Ошибка ввода! Пожалуйста, введите положительное целое число.")
            exitProcess(1)
        }

        println("Введите количество элементов в массиве:")
        val size = readLine()!!.toInt()

        if (size <= 0) {
            println("Ошибка ввода! Пожалуйста, введите положительное целое число.")
            exitProcess(1)
        }

        println("Введите элементы массива:")
        val array = Array(size) { readLine()!!.toInt() }

        var result: Boolean = false

        for (i in array) {
            if (i == num) {
                result = true
                break
            }
        }

        println("Число $num находится в " + if (result) "массиве" else "массиве не содержится")
    }