package com.gilaufen.newproyect.funordenSuperior

//esta es una función de oden superior la cual puede tener como paramentros una función que trae datos
fun operar(numero: Double, numero2:Double, fn: (Double,Double )->Double):Double {

    return fn(numero, numero2)
}

//función definida
fun sumar(numero:Double, numero2:Double) = numero+numero2
fun restar(numero:Double, numero2:Double) = numero-numero2


fun main(){
    val resultadoSuma = operar(15.5,5.0,::sumar)
    println(resultadoSuma)
    val resultadoResta= operar (7.0, 9.0, ::restar)
    println(resultadoResta)

}