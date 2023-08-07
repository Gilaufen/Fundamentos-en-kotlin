package com.gilaufen.fundamentoskotlin.Reto1

class Reto1 {
}

fun main(){
    println("Ingrese la cantidad de mensajes que ha recibido")
    var nMensajes: Int= readLine()!!.toInt()

    when(nMensajes){
        0 -> println("No hay mensajes disponibles")
        in 1..99 -> println("Ha recibido $nMensajes notificaciones")
        in 100.. 1000 -> print("Ha recibido +99 mensajes")
    }
}