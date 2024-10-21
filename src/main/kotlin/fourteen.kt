package org.example

import kotlin.system.exitProcess
//Program15: Вводится длина массива.
// Затем вводится длина для нового массива.
// Напишите программу, которая создаёт массив из этих чисел и выводит их новый массив,
// содержащий все те же числа, но в обратном порядке
fun main() {

        println("Введите длину первого массива:")
        val size1 = readLine()!!.toInt()

        if (size1 <= 0) {
            println("Ошибка ввода! Пожалуйста, введите положительное целое число.")
            exitProcess(1)
        }

        println("Ввведите элементы первого массива:")
        val array1: IntArray = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        println("Введите длину второго массива:")
        val size2 = readLine()!!.toInt()

        if (size2 <= 0) {
            println("Ошибка ввода! Пожалуйста, введите положительное целое число.")
            exitProcess(1)
        }

        println("Ввведите элементы второго массива:")
        val array2: IntArray = readLine()!!.split(" ").map { it.toInt() }.toIntArray()

        val result: IntArray

        if (size1 > size2) {
            result = array1.copyOfRange(size1 - 1, size1)
        } else {
            result = array2.copyOfRange(array2.size - 1, array2.size)
        }

        println("Новый массив:")
        for (i in result) {
            print("$i ")
        }
}