package com.gilaufen.fundamentoskotlin.Reto4

class Reto4 {
}

fun main() {
    val menu = mutableListOf(
        mutableListOf(""), // Entradas
        mutableListOf(""), // Platos Fuertes
        mutableListOf(""), // Postres
        mutableListOf("")  // Bebidas
    )

    while (true) {
        println("Seleccione una opción: \n1. Agregar plato \n2. Mostrar todos los platos \n3. Mostrar platos por categoría \n4.Modificar menú \n5. Eliminar plato \n6. Salir")
        var seleccion:Int= readLine()!!.toInt()

        when (seleccion) {
            1 -> {
                println("Seleccione una categoría: \n1.Entradas \n2.Platos Fuertes \n3.Postres \n4.Bebidas")
                val categoria:Int = readLine()!!.toInt()

                when(categoria){
                    1->{
                        println("Ingrese un nombre para la entrada")
                        var entrada:String = readLine().toString()
                        menu[0].add(entrada)
                    }
                    2->{
                        println("Ingrese un nombre para el plato fuerte")
                        var fuerte:String = readLine().toString()
                        menu[1].add(fuerte)
                    }
                    3->{
                        println("Ingrese un nombre para el postre")
                        var postre:String = readLine().toString()
                        menu[2].add(postre)
                    }
                    4->{
                        println("Ingrese un nombre para la bebida")
                        var bebida:String = readLine().toString()
                        menu[3].add(bebida)
                    }
                }
                println(menu)
            }
            2 -> {
                for ((categoriaIndex, platos) in menu.withIndex()) {
                    println("${obtenerNombreCategoria(categoriaIndex)}:")
                    for ((platoIndex, plato) in platos.withIndex()) {
                        println("${platoIndex + 1}. ${plato.nombre} - ${plato.descripcion} - $${plato.precio}")
                    }
                }
            }
            3 -> {
                println("Categorías:")
                for (i in menu.indices) {
                    println("${i + 1}. ${obtenerNombreCategoria(i)}")
                }

                print("Seleccione una categoría (1-${menu.size}): ")
                val categoria = readLine()?.toIntOrNull()

                if (categoria != null && categoria in 1..menu.size) {
                    println("${obtenerNombreCategoria(categoria - 1)}:")
                    for ((platoIndex, plato) in menu[categoria - 1].withIndex()) {
                        println("${platoIndex + 1}. ${plato.nombre} - ${plato.descripcion} - $${plato.precio}")
                    }
                } else {
                    println("Categoría inválida. Por favor, seleccione una categoría válida.")
                }
            }
            4 -> {
                println("Categorías:")
                for (i in menu.indices) {
                    println("${i + 1}. ${obtenerNombreCategoria(i)}")
                }

                print("Seleccione una categoría (1-${menu.size}): ")
                val categoria = readLine()?.toIntOrNull()

                if (categoria != null && categoria in 1..menu.size) {
                    println("\n${obtenerNombreCategoria(categoria - 1)}:")
                    for ((platoIndex, plato) in menu[categoria - 1].withIndex()) {
                        println("${platoIndex + 1}. ${plato.nombre} - ${plato.descripcion} - $${plato.precio}")
                    }

                    print("Seleccione el número del plato que desea modificar: ")
                    val platoSeleccionado = readLine()?.toIntOrNull()

                    if (platoSeleccionado != null && platoSeleccionado in 1..menu[categoria - 1].size) {
                        val plato = menu[categoria - 1][platoSeleccionado - 1]

                        println("\nModificar Plato:")
                        print("Ingrese el nuevo nombre del plato (${plato.nombre}): ")
                        val nombre = readLine()?.takeIf { it.isNotEmpty() } ?: plato.nombre

                        print("Ingrese la nueva descripción del plato (${plato.descripcion}): ")
                        val descripcion = readLine()?.takeIf { it.isNotEmpty() } ?: plato.descripcion

                        print("Ingrese el nuevo precio del plato (${plato.precio}): ")
                        val precio = readLine()?.toDoubleOrNull() ?: plato.precio

                        menu[categoria - 1][platoSeleccionado - 1] = Plato(nombre, descripcion, precio)
                        println("Plato modificado exitosamente.")
                    } else {
                        println("Número de plato inválido. Por favor, seleccione un número de plato válido.")
                    }
                } else {
                    println("Categoría inválida. Por favor, seleccione una categoría válida.")
                }
            }
            5 -> {
                eliminarPlato(menu)
            }
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

