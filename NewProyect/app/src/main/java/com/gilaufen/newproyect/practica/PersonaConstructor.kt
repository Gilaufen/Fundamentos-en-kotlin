package com.gilaufen.newproyect.practica


//se puede crar el constructor en la misma creación de la clase se usa la palabra reservada Costructor

class PersonaConstructor constructor(nombre: String, edad: Int){
    var nombre: String = nombre
    var edad: Int = edad

    fun imprimir(){
        println("Nombre $nombre \n Edad: $edad")
    }

    fun mayorEdad(){
        if(edad >=18){
            println("$nombre es mayor de edad, puede ingresar")
        } else {
            println("$nombre es menor de edad, no puede ingresar")
        }
    }
}