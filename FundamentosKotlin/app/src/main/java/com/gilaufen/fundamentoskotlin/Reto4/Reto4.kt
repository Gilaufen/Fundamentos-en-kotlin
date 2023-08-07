package com.gilaufen.fundamentoskotlin.Reto4

class Reto4 {
}

fun main() {
    val menu = mutableListOf(
        mutableListOf("Fruta"), // Entradas
        mutableListOf("Pulpo"), // Platos Fuertes
        mutableListOf("Esponjado de mora"), // Postres
        mutableListOf("jugo de banano")  // Bebidas
    )

    while (true) {
        println("Seleccione una opción: \n1. Agregar plato \n2. Mostrar todos los platos \n3. Mostrar platos por categoría \n4.Modificar menú \n5. Eliminar plato \n6. Salir")
        var seleccion:Int= readLine()!!.toInt()

        when (seleccion) {
            1 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                val categoria: Int = readLine()!!.toInt()

                when (categoria) {
                    1 -> {
                        println("Ingrese un nombre para la entrada")
                        var entrada: String = readLine().toString()
                        menu[0].add(entrada)
                    }

                    2 -> {
                        println("Ingrese un nombre para el plato fuerte")
                        var fuerte: String = readLine().toString()
                        menu[1].add(fuerte)
                    }

                    3 -> {
                        println("Ingrese un nombre para el postre")
                        var postre: String = readLine().toString()
                        menu[2].add(postre)
                    }

                    4 -> {
                        println("Ingrese un nombre para la bebida")
                        var bebida: String = readLine().toString()
                        menu[3].add(bebida)
                    }
                }
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
                val categoria: Int = readLine()!!.toInt()
            }
            /*
            4 -> {

            }
            5 -> {

            }
            */
            6 -> {
                println("Gracias por utilizar el programa. ¡Hasta pronto!")
                return
            }
            else -> {
                println("Opción inválida. Por favor, seleccione una opción válida.")
            }
        }
    }
}

