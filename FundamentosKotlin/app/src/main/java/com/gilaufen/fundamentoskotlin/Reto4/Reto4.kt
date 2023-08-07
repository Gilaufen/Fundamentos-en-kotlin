package com.gilaufen.fundamentoskotlin.Reto4

class Reto4 {
}

fun main() {
    val menu = mutableListOf(
        mutableListOf(mutableListOf("fruta","Plato con banano y papaya",2000),mutableListOf("sopa","Plato de sopa con pasta",5000)), // Entradas
        mutableListOf(mutableListOf("Pulpo","Plato de pulpo frito con salsa de soya",20000),mutableListOf("bandeja paisa","plato Bandeja paisa colombiana",10000)), // Platos Fuertes
        mutableListOf(mutableListOf("Esponjado de mora","Esponjado de mora con salsa de mora",5000),mutableListOf("Tiramisú","Postre de galletas remojadas en cafe cubierto con crema",6000)), // Postres
        mutableListOf(mutableListOf("Jugo de banano","Jugo de babano con crema batida",3000),mutableListOf("Limonada","Limonada con azucar y naranja",1000))  // Bebidas
    )

    while (true) {
        println("Seleccione una opción: \n1. Agregar plato \n2. Mostrar todos los platos \n3. Mostrar platos por codigo \n4.Modificar menú \n5. Modificar plato \n6.Eliminar un plato \n7. Salir")
        var seleccion:Int= readLine()!!.toInt()

        when (seleccion) {
            1 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Ingrese un nombre para el plato")
                var nombre: String = readLine().toString()
                println("Ingrese una descripción para el plato")
                var descripcion: String = readLine().toString()
                println("Ingrese un precio para el plato")
                var precio: Int = readLine()!!.toInt()
                menu[categoria-1].add(mutableListOf(nombre,descripcion,precio))
            }

            2 -> {
                println("꧁╭⊱------Entradas------⊱╮꧂")
                println("")
                for ((index, element) in menu[0].withIndex()) {
                    println("▼ Nombre: ${menu[0][index][0]} - Descipción: ${menu[0][index][1]} - Precio: ${menu[0][index][2]}")
                }
                println("꧁╭⊱------Platos fuertes------⊱╮꧂")
                println("")
                for ((index, element) in menu[1].withIndex()) {
                    println("▼ Nombre: ${menu[1][index][0]} - Descipción: ${menu[0][index][1]} - Precio: ${menu[0][index][2]}")
                }
                println("꧁╭⊱------Postres------⊱╮꧂")
                println("")
                for ((index, element) in menu[2].withIndex()) {
                    println("▼ Nombre: ${menu[2][index][0]} - Descipción: ${menu[0][index][1]} - Precio: ${menu[0][index][2]}")
                }
                println("꧁╭⊱------Bebidas------⊱╮꧂")
                println("")
                for ((index, element) in menu[3].withIndex()) {
                    println("▼ Nombre: ${menu[3][index][0]} - Descipción: ${menu[0][index][1]} - Precio: ${menu[0][index][2]}")
                }
                println("")
            }

            3 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()
                println("Ingrese el código del plato")
                var posicion:Int= readLine()!!.toInt()
                println("▼ Nombre: ${menu[categoria-1][posicion][0]} - Descipción: ${menu[categoria-1][posicion][1]} - Precio: ${menu[categoria-1][posicion][2]}")
            }

            4 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Vamos a editar todas los platos de esta categoría")
                for ((index, element) in menu[categoria-1].withIndex()) {
                println("▼ Nombre: ${menu[categoria-1][index][0]} - Descipción: ${menu[categoria-1][index][1]} - Precio: ${menu[categoria-1][index][2]}")
                println("Ingrese un nombre para el plato")
                var nombre: String = readLine().toString()
                println("Ingrese una descripción para el plato")
                var descripcion: String = readLine().toString()
                println("Ingrese un precio para el plato")
                var precio: Int = readLine()!!.toInt()
                menu[categoria-1][index]=(mutableListOf(nombre,descripcion,precio))
                }
            }

            5 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Ingrese la posición del plato que desea editar")
                var posicion:Int= readLine()!!.toInt()
                println("▼ Nombre: ${menu[categoria-1][posicion][0]} - Descipción: ${menu[categoria-1][posicion][1]} - Precio: ${menu[categoria-1][posicion][2]}")
                println("Ingrese un nombre para el plato")
                var nombre: String = readLine().toString()
                println("Ingrese una descripción para el plato")
                var descripcion: String = readLine().toString()
                println("Ingrese un precio para el plato")
                var precio: Int = readLine()!!.toInt()
                menu[categoria-1][posicion]=(mutableListOf(nombre,descripcion,precio))
            }

            6->{
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Ingrese la posición del plato que desea eliminar")
                var posicion:Int= readLine()!!.toInt()
                menu[categoria-1].removeAt(posicion)
            }
            7 -> {
                println("Gracias por utilizar el programa. ¡Hasta pronto!")
                return
            }
            else -> {
                println("Opción inválida. Por favor, seleccione una opción válida.")
            }
        }
    }
}

