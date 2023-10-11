package com.gilaufen.newproyect.practica

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun inicializar(nombre:String, edad: Int){
        this.nombre = nombre
        this.edad = edad
    }

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