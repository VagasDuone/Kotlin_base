package org.example
//Program2: проверяет, является ли введенный символ буквой, выводя true или false
fun main(args: Array<String>) {
    print("Введите символ: ")
        val input = readLine()?.firstOrNull()

        if (input != null) {
            val isLetter = input.isLetter()
            println(isLetter)
        } else {
            println("Некорректный ввод.")
        }
}