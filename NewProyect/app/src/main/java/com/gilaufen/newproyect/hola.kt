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
   val calculoSuperficie = supUnExpre(ladoRecogido)
   println("la superficie es ${calculoSuperficie}")
}

fun main(){
   //datos()
   //println("el numero mayor es :${mayor(1,2)}")
   println("el numero es ${whenN(2)}")
}

//funciones de única expresión,son las que solo hacen una cosa y la podemos llamar en cualquier parte del código
fun supUnExpre(lado: Int)=lado*lado

//tambien en las funciones de unica expresión puedo hacer condicionales
fun ifN(numero1:Int , numero2:Int)=if(numero1>numero2)numero1 else numero2

fun whenN(numero1:Int) = when (numero1){
      1-> "Uno"
      2 -> "Dos"
      3 -> "Tres"
      4 -> "Cuatro"
      else -> "Digite oto numero"
}