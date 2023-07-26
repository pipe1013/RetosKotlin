package com.pipe1013.retos.Retos

class Reto2 {
}

fun main() {

    var c=1
    var total=0
    var totalFinal=0
    while (c==1) {
        println("Digite el precio del producto: ")
        var numero: Int = readLine()!!.toInt()
        total = total + numero

        println("El total de tu compra es: $total")
        println("Desea seguir digitando números? Escriba (1) para si o (2) para no")
        c = readLine()!!.toInt()
    }

    if (total > 50000) {
        println(
            "Tienes la oportunidad de sacar una boleta y ganarte " +
                    "un descuento en el valor total de tu compra"
        )
        println("Jugando... ")
        var results: Int = (1..4).random() // Generación de números aleatorios
        println("El número es $results")

        if (results == 1) {
            println("Felicitaciones sacaste la boleta roja!!")
            totalFinal = total*10/100
            println("El total de la compra es: $totalFinal")

        }
        if (results==2){
            println("Felicitaciones sacaste la boleta Azul!!")
            totalFinal = total*30/100
            println("El total de la compra es: $totalFinal")
        }
        if (results==3){
            println("Felicitaciones sacaste la boleta amarrila!!")
            totalFinal = total*50/100
            println("El total de la compra es: $totalFinal")
        }
        if (results==4){
            println("Felicitaciones sacaste la boleta blanca!!")
            totalFinal = 0
            println("El total de la compra es: $totalFinal")
        }
    } else {
        println("No ganaste nada")
    }
}

