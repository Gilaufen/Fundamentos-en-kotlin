package com.gilaufen.newproyect.practica


//las clases en kotlin pueden recibir parametros

class PersonaParametros(var nombre: String, var edad:Int){

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