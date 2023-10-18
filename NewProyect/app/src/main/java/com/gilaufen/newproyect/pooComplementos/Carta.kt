package com.gilaufen.newproyect.pooComplementos

//tipo cartas toma un valor de las constantes definidas de la clase enum
class Carta(val tipoCartas: datosCartas, val numeroCarta: Any) {
    fun imprimir() {
        println("Carta: ${tipoCartas} Valor: ${numeroCarta}")
    }
}

fun main(){

    val prueba = datosCartas.values().random()

    val carta = Carta(datosCartas.values().random(), prueba.numCarta.random())

    val pruebita = Carta(datosCartas.values().random(), prueba.numCarta[0])

    carta.imprimir()
    pruebita.imprimir()

}