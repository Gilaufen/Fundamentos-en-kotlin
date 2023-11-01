package com.gilaufen.newproyect.ExpresionesLambda

//cuando enviamos una funcion de orden superior a una función anónima, osea que se ejecuta ahí mismo
//no entiendo

fun operar(numero1: Double, numero2: Double, fn:(Double,Double)->Double):Double{
    return fn(numero1,numero2)
}


//funcion anonima, tipo no existe sino cuando llamamos la función de orden superior la creamos, eso es lo que se crea en las "{ }"

fun main(){
    val sumar= operar(5.0,4.0, {numero1, numero2 -> numero1 + numero2})
    println(sumar)
}