package org.example
//Program4: считывает символ в нижнем регистре, преобразовывает его в верхний, а затем выводит код Unicode нового символа
fun main(args: Array<String>) {
    print("Введите число в нижнем регистре: ")
    val symbol = readLine()!!.toLowerCase()
    if (symbol.length == 1) {
        val upperCaseSymbol = Character.toUpperCase(symbol[0])
        println("The Unicode code of the uppercase letter is ${upperCaseSymbol.toInt()}")
    } else {
        println("Invalid input. Please enter a single lowercase letter.")
    }
}
