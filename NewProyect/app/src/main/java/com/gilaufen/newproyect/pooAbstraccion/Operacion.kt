package com.gilaufen.newproyect.pooAbstraccion

//para las clases abstractas usamos el abstract antes de la palabra class
abstract class Operacion (val numero1: Int, val numero2: Int){

    protected var resultado: Int = 0

    //también se puede con los métodos
    abstract fun operar()

    fun imprimir(){
        println("Resultado ${resultado}")
    }

}