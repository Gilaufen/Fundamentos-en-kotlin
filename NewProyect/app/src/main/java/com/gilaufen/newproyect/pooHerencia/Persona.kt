package com.gilaufen.newproyect.pooHerencia


//con la palabra opne antes de class esta clase puede ser heredada
open class Persona(val nombre: String, val edad: Int) {

    //también se usa en las funciones
    open fun imprimir(){
        println("Nombre: ${nombre}")
        println("Edad: ${edad}")
    }

}