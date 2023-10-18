package com.gilaufen.newproyect.pooComplementos

//tipo cartas toma un valor de las constantes definidas de la clase enum
class Carta(val tipoCartas: datosCartas, val numeroCarta: Any) {
    fun imprimir() {
        println("Carta: ${tipoCartas} Valor: ${numeroCarta}")
    }

    fun calculosMath(){
        println("El valor de PI= ${Mathe.PI}")
        println("Un valor aleatorio entre 1 y 100")
        println(Mathe.aleatorio(1,100))
    }
}

fun main(){

    val prueba = datosCartas.values().random()
    val carta = Carta(prueba, prueba.numCarta.random())
    carta.imprimir()

    carta.calculosMath()

}