package com.gilaufen.fundamentoskotlin.Reto2

class Reto2 {
}

fun main(){
    println("Bienvendio aquí podrá registrar información sobre un album \n¿Cuántas canciones tiene este album?")
    var nCanciones:Int= readLine()!!.toInt()
    var canciones = Array<Array<String?>>(nCanciones) { arrayOfNulls<String>(4) }
    println("Qué tipo de música tiene es álbum")
    var tipoM:String= readLine().toString()

    for ((index,elements) in canciones.withIndex()){
        println("Ingrese el Título de la canción #$index")
        var titulo:String= readLine().toString()
        println("Ingrese el artista de la canción $titulo")
        var artista:String= readLine().toString()
        println("Ingrese el año de publicación de la canción $titulo")
        var anio:String= readLine().toString()
        println("Ingrese la cantidad de reproducciones que ha tenido $titulo")
        var cantidad:Int= readLine()!!.toInt()

        canciones[index]= arrayOf(titulo,artista,anio,cantidad.toString())
    }
    println("¿Qué acción desea realizar?\n Elija un número \n1.Ver la canción más popular \n2.Ver la popularidad de las canciones \n3.Ver todas las canciones")
    var respuesta:Int= readLine()!!.toInt()
    when(respuesta) {
        1 -> {
            println("Popularidad de las canciones:")
            canciones.sortedByDescending { 3 }
            for ((index, element)
            in canciones.withIndex()) {
                if (canciones[index] == canciones.last()) {
                    println("${canciones[index][0]} tiene ${canciones[index][3]} reproducciones, es la canción más popular del álbum")
                } else {
                    println("${canciones[index][0]} tiene ${canciones[index][3]} reproducciones")
                }
            }
        }

        2 -> {
            for ((index, element) in canciones.withIndex()) {
                var n = canciones[index][3]!!.toInt()
                if (n < 1000) {
                    println("${canciones[index][0]} tiene ${canciones[index][3]} reproducciones, es poco popular")
                } else {
                    println("${canciones[index][0]} tiene ${canciones[index][3]} reproducciones, es muy popular")
                }
            }
        }

        3 -> {
            for ((index, element) in canciones.withIndex()) {
                println("${canciones[index][0]}, interpretada por ${canciones[index][1]}, se lanzó en ${canciones[index][2]}, tiene ${canciones[index][3]} reproducciones")
            }
        }
    }
}

