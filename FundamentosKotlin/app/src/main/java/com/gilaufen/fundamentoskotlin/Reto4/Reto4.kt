package com.gilaufen.fundamentoskotlin.Reto4

class Reto4 {
}

fun main() {
    val menu = mutableListOf(
        mutableListOf("Fruta","sopa"), // Entradas
        mutableListOf("Pulpo","bandeja paisa"), // Platos Fuertes
        mutableListOf("Esponjado de mora","tiramisu"), // Postres
        mutableListOf("jugo de banano","limonada")  // Bebidas
    )

    while (true) {
        println("Seleccione una opción: \n1. Agregar plato \n2. Mostrar todos los platos \n3. Mostrar platos por categoría \n4.Modificar menú \n5. Modificar plato \n6.Eliminar un plato \n7. Salir")
        var seleccion:Int= readLine()!!.toInt()

        when (seleccion) {
            1 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Ingrese un nombre para el plato")
                var plato: String = readLine().toString()
                menu[categoria-1].add(plato)
            }

            2 -> {
                println("꧁╭⊱------Entradas------⊱╮꧂")
                println("")

                for ((index, element) in menu[0].withIndex()) {
                    println("▼ ${menu[0][index]}")
                }

                println("꧁╭⊱------Platos fuertes------⊱╮꧂")
                println("")

                for ((index, element) in menu[1].withIndex()) {
                    println("▼ ${menu[1][index]}")
                }

                println("꧁╭⊱------Postres------⊱╮꧂")
                println("")

                for ((index, element) in menu[2].withIndex()) {
                    println("▼ ${menu[2][index]}")
                }
                println("꧁╭⊱------Bebidas------⊱╮꧂")
                println("")
                for ((index, element) in menu[3].withIndex()) {
                    println("▼ ${menu[3][index]}")
                }
                println("")

            }

            3 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()
                println("Ingrese el código del plato")
                var posicion:Int= readLine()!!.toInt()

                for ((index,element) in menu[categoria-1].withIndex()){
                    if(menu[categoria-1][index] == menu[categoria-1][posicion]) {
                        println("▼ ${menu[categoria-1][posicion]}")
                    }
                }
            }

            4 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Vamos a editar todas los platos de esta categoría")
                for ((index, element) in menu[categoria-1].withIndex()) {
                    println("El plato es $element, ingrese un nuevo nombre")
                    menu[categoria-1][index]= readLine().toString()
                }
            }
            5 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                var categoria: Int = readLine()!!.toInt()

                println("Ingrese la posición del plato que desea editar")
                var posicion:Int= readLine()!!.toInt()
                println("El plato es ${menu[categoria-1][posicion]}, ingrese un nuevo nombre")
                menu[categoria-1][posicion]= readLine().toString()
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

