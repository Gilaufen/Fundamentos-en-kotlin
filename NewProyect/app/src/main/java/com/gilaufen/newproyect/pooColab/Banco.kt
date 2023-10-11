package com.gilaufen.newproyect.pooColab

//por defecto todas las clases son públicas, para hacer privadas las clases usamos el private and protected
class Banco {

    val cliente1: Cliente = Cliente("Andres", 0f)
    val cliente2: Cliente = Cliente("Andrea", 0f)
    val cliente3: Cliente = Cliente("David", 0f)

    fun movimientos(){
        cliente1.consignar(100000f)
        cliente2.consignar(250000f)
        cliente3.consignar(300000f)
        cliente3.retirar(180000f)
    }

    fun estadoCuenta(){
        val total = cliente1.saldoCuenta+cliente2.saldoCuenta+cliente3.saldoCuenta

        println("El saldo total en el banco es $total")

        cliente1.imprimir()
        cliente2.imprimir()
        cliente3.imprimir()
    }
}