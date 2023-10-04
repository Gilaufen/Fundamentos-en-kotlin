package com.gilaufen.newproyect

class arreglos {
}

fun salario(){
    val salarios: DoubleArray
    salarios = DoubleArray(5)
    for (i in 0..4){
        println("Ingrese el salario del empleado: ")
        salarios[i] = readln().toDouble()
    }
    for (i in 0..4){
        println(salarios[i])
    }
    fun orden(arreglo:DoubleArray) = arreglo.sort()

    orden(salarios)

    for (i in 0..4) {
        println(salarios[i])
    }


}



fun main(){
    salario()
}