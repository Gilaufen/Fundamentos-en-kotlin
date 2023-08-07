package com.gilaufen.fundamentoskotlin.Reto3

class Reto3 {
}

fun main() {
    var oferta= 0.0
    val articulos = listOf(
        listOf("gomita",10.0) ,
        listOf("zapatilla",10.0),
        listOf("torta",10.0)
    )

    for ((i,element) in articulos.withIndex()) {
        println("")
        println("꧁╭⊱------Casa de apuestas CuteTreasures------⊱╮꧂")
        println("")
        println("Subasta del artículo $i, su precio base es ${articulos[i][1]}")
        val ofertas = mutableListOf<Double>()

        do {
            println("La oferta mayor de la ${articulos[i][0]} es: ${ofertas.maxOrNull()}")
            print("Ingrese su oferta o 0 para finalizar: ")
            oferta = readLine()!!.toDouble()
            if (oferta > 0) {
                ofertas.add(oferta)
            }
        } while (oferta > 0)

        if(ofertas.isEmpty()){
            println("El articulo se vendió a la casa de subastas por ${articulos[i][1]}")
        }else{
            var mayor = ofertas.maxOrNull()
            println("El artículo ${articulos[i][0]} se vende a $mayor")
        }

    }
    println("")
    println("꧁╭⊱------Todos los objetos han sido subastados------⊱╮꧂")

}