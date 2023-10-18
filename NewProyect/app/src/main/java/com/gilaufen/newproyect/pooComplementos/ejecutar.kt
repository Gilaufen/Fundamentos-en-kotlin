package com.gilaufen.newproyect.pooComplementos


fun main() {

    //los data class pordrían funcionar como objetos pero solo guardan datos
    val producto1 = productos(1, "leche", 5000.0)
    val producto2 = productos(2, "pan", 2000.0)

    println(producto1.descripcion)
    println(producto2)

    producto1.precio = 1000.0

    println(producto1)

    //se pueden copiar los datos de los data class

    //pero también los podemos modificar
    var producto3 = producto2.copy(codigo = 3,precio = 3000.0)
    println(producto3)

}