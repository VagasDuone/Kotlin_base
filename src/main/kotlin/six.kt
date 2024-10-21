package org.example
//Program6: Вводится строка, программу, удаляет из нее первые два элемента и вставляет их в конец
fun main(args: Array<String>) {
    println("введите строку")
    val input = readLine() ?: ""
    if (input.length >= 2) {
        val modifiedStr = input.substring(1) + input.substring(1 , input.length - 2)
                                        // пропуск
        print("результат $modifiedStr")
    }
    else
        println("Строка слишком короткая для выполнения операции")
}