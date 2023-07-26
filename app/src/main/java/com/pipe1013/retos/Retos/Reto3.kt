package com.pipe1013.retos.Retos

class Reto3 {
}

fun main() {

    var c = 1

    var carros = mutableListOf<String>()
    while (c == 1) {
        println(
            "Bienvenido ;) \n Por favor escoja una opción: \n 1. Para INSERTAR un nuevo auto \n 2. Para MOSTRAR todos los resultados de la lista" +
                    "\n 3. Para BUSCAR un carro en particular \n 4. Para MODIFICAR un vehiculo existente \n 5. Para ELIMINAR un vehiculo existente"
        )
        var opcion: Int = readLine()!!.toInt()
        when (opcion) {

            1 -> {
                println("Por favor digite el modelo del carro")
                var respu: String = readLine()!!.toString()
                respu = respu.toLowerCase()
                if (carros.contains(respu)) {
                    println("El carro ya existe")
                } else {
                    carros.add(respu)
                    println("El carro se a agregado correctamnete ")
                }
            }

            2 -> {
                println("La lista esta conformada por: \n $carros")
            }

            3 -> {
                println("Por favor digite el modelo del carro que desea buscar")
                var busqueda: String = readLine()!!.toString()
                busqueda = busqueda.toLowerCase()
                var search = carros.indexOf(busqueda)
                if (carros.contains(busqueda)) {
                    println("El elemento $busqueda está en la lista y en la posición $search")
                } else {
                    println("El elemento $busqueda no está en la lista")
                }
            }

            4 -> {
                println("Estos son los carros que contine la lista: $carros")
                println("Digite el nombre del carro que desea modificar")
                var modify: String = readLine()!!.toString()
                modify = modify.toLowerCase()
                var indexmodify = carros.indexOf(modify)
                println("Digite el nuevo nombre del carro:")
                var nuevo: String = readLine()!!.toString()
                nuevo = nuevo.toLowerCase()
                carros[indexmodify] = nuevo
                println(carros)
            }

            5 -> {
                println("Estos son los carros que contine la lista: $carros")
                println("Digite el nombre del carro que desea eliminar")
                var delete: String = readLine()!!.toString()
                delete = delete.toLowerCase()
                var indexdDelete = carros.indexOf(delete)
                carros.removeAt(indexdDelete)
                println("El carro fue eliminado ")
                println(carros)
            }

        }
        println("Desea seguir haciendo cambios? Escriba:  \n (1) para si \n (2) para no")
        c = readLine()!!.toInt()
    }
    println("Gracias por preferirnos")

}


