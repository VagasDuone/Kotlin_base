package org.example
//Program3: преобразует два введённых символа в Unicode и выводит их разность
fun main(args: Array<String>) {
    print("Введите первый символ: ")
    val char1 = readLine()?.firstOrNull()

    print("Введите второй символ: ")
    val char2 = readLine()?.firstOrNull()

    if (char1 != null && char2 != null) {
        val unicode1 = char1.code
        val unicode2 = char2.code
        val difference = unicode1 - unicode2

        println("Код первого символа (Unicode): $unicode1")
        println("Код второго символа (Unicode): $unicode2")
        println("Разность: $difference")
    } else {
        println("Некорректный ввод.")
    }
}