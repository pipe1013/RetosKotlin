package com.pipe1013.retos.Retos

class Reto1 {
}

fun main() {
    println("APUESTA CON DADOS")

    var dado1: Int=(1..6).random()
    var dado2: Int=(1..6).random()

    var resultado=dado1+dado2;

    if (dado1==1 && dado2==1){
        println("Ganaste los dados son $dado1 y $dado2 ganas por que son 1")
    }else if(resultado==3){
        println("Ganaste por que tu resultado es $resultado")
    }else if (resultado==11){
        println("Ganaste por que tu resultado es $resultado")
    }else if (resultado==2 || resultado==12){
        println("Ganaste sacaste $resultado")
    }else if (resultado==7){
        println("Ganaste por que tu resultado es $resultado")
    }else{
        println("Lo siento perdiste por que los dados no te arrojan")
    }
}