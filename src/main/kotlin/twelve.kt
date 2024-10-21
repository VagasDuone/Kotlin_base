package org.example
//Program7: реализовать программу которая безопасно вызовет свойство length на строке и выведет результат,
// если строка не null.
fun main() {
    var str: String? = "Hello"

    // Безопасный вызов свойства длины
    val len: Int = str?.length ?: 0

    println("Длина строки составляет $len")
}