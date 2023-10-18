package com.gilaufen.newproyect.pooHerencia

fun main(){
    val persona = Persona("Andrea Peña", 16)
    //persona.imprimir()

    val empleado = Empleado( persona.nombre, persona.edad, 6000000.0)
    empleado.imprimir()
    empleado.impuesto()

    val empleado2 = Empleado( "angie", 25, 60000.0)

    //en efecto puedo llamar la funcion heredada como propia de empleado
    empleado2.imprimir()
    empleado2.impuesto()
}