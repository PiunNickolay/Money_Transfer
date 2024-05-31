package ru.netology

fun main() {
    val amount = 50
    val comission = 0.0075
    var result = if (amount >= 35) amount*comission else 0
    println("Комиссия составит: $result (рублей)")
}
