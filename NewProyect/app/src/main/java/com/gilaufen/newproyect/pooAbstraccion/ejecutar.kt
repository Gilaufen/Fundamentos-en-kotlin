package com.gilaufen.newproyect.pooAbstraccion

fun main(){
    val suma = Sumar(5,3)
    suma.operar()
    suma.imprimir()

    val resta = Restar(5,3)
    resta.operar()
    resta.imprimir()
}