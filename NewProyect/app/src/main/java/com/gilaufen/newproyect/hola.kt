package com.gilaufen.newproyect

class hola {

}

fun superficie(lado:Int):Int{
   val superficie = lado * lado
   return superficie
}

fun datos(){
   println("Ingrese el valor del dado")
   val ladoRecogido = readln().toInt()
   val calculoSuperficie = superficie(ladoRecogido)
   println("la superficie es ${calculoSuperficie}")
}