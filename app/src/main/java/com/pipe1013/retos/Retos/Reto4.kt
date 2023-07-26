package com.pipe1013.retos.Retos

class Reto4{
    var saldoDisponible = 4500
    var attempts = 3
    var phone: Long = 3208243856
    var password = 1234

    fun ingresa(): Boolean {
        while (attempts > 0) {
            println("Ingrese su número de celular:")
            val phoneNumber: Long = readLine()!!. toLong()
            println("Ingrese su clave de 4 dígitos:")
            val pin : Int = readLine()!!. toInt()
            if (phoneNumber == phone && pin == password) {
                return true
            } else {
                attempts--
                println("¡Upps! Parece que tus datos de acceso no son correctos.")
                if (attempts > 0) {
                    println("Tienes $attempts intento(s) más.")
                } else {
                    println("Lo siento, has agotado tus intentos. La sesión se cerrará.")
                    return false
                }
            }
        }
        return false
    }

    fun saldo() {
        println("Su saldo es de $saldoDisponible")
    }

    fun saca() {
        println("Por favor seleccione el medio por el cual quiere realizar el retiro: \n (1) Para cajero \n (2) Para punto fisico")
        var place: String = readLine()!!.toString()
        if (saldoDisponible < 2000) {
            println("No te alcanza")
        } else {
            println("Por favor digite el monto a retirar")
            var montoRetiro: Int = readLine()!!.toInt()

            if (montoRetiro > saldoDisponible) {
                println("Tu saldo es menor al monto")
            } else {
                var generarcodigo: Int = (100000..900000).random()
                println("Su codigo es : $generarcodigo")
                println("Por favor digite el codigo: ")
                var codigo: Int = readLine()!!.toInt()

                if (codigo == generarcodigo) {
                    saldoDisponible = saldoDisponible - montoRetiro
                    println("Ya puedes retirar el dinero \n Ahora tu saldo es de $saldoDisponible")
                }
                else{
                    println("El codigo esta mal")
                }
            }
        }
    }

    fun envia() {
        println("Por favor digita el número al que deseas enviar dinero")
        var num: Long = readLine()!!.toLong()
        println("Por favor digita el monto que deseas enviar")
        var montoEnviar: Int = readLine()!!.toInt()

        if (montoEnviar > saldoDisponible) {
            println("Saldo insuficiente")
        } else {
            saldoDisponible = saldoDisponible - montoEnviar
            println("Envio exitoso !! \n Tu saldo actual es de: $saldoDisponible")
        }
    }

    fun recarga() {
        println("Cuánto desea recargar ?")
        var recarga: Int = readLine()!!.toInt()
        println("Desea confimar la trasaccion: \n (1).Si \n (2).No")
        var respu: Int = readLine()!!.toInt()
        if (respu == 1) {
            saldoDisponible = saldoDisponible + recarga
            println("Recarga exitosa!! \n Tu saldo actual es de $saldoDisponible")
        } else {
            println("Transaccion cancela")
        }
    }
}
fun main() {
    val reto4 = Reto4()

    if (reto4.ingresa()) {
        var exitApp = false
        while (!exitApp) {
            println("------ Opciones de Nequi ------")
            println("1. Mostrar Saldo")
            println("2. Retirar")
            println("3. Enviar Dinero")
            println("4. Recargar")
            println("5. Salir")
            println("------------------------------")
            println("Ingrese el número de la opción que desea realizar:")
            val option = readLine()?.toIntOrNull()

            when (option) {
                1 -> reto4.saldo()
                2 -> reto4.saca()
                3 -> reto4.envia()
                4 -> reto4.recarga()
                5 -> exitApp = true
                else -> println("Opción inválida. Intente nuevamente.")
            }
        }
        println("¡Gracias por usar Nequi! Hasta pronto.")
    } else {
        println("La sesión se cerrará. Intenta nuevamente más tarde.")
    }
}

