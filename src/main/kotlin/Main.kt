package ru.netology

fun main() {
    val amount = 5000
    val comission = 0.0075
    var result:Double = amount*comission
    if (result<35){
        println("Комиссия составит: 35 (рублей)")
    }else {
        println("Комиссия составит: $result (рублей)")
    }
}
