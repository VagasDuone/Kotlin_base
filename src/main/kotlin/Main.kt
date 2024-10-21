package org.example
//Program1: находит среднее арифметическое трёх введённых чисел с плавающей точкой
fun main() {
    print("Введите первое число: ")
    val num1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Введите второе число: ")
    val num2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Введите третье число: ")
    val num3 = readLine()?.toDoubleOrNull() ?: 0.0

    // Вычисление среднего арифметического
    val average = (num1 + num2 + num3) / 3

    // Вывод результата
    println("Среднее арифметическое введённых чисел: $average")

    }
