package org.example
//Program12: Вводится число,
// программа должна выводит удвоенные числа от 1 до n (обе границы не включены в диапазон)
fun main() {
    print("Введите число: ")
    val n = readLine()!!.toInt()
    for (i in 1 until n) {
        println(i * 2)
    }
}
