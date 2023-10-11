package com.gilaufen.newproyect.pooColab

class Persona {
    var nombre: String = ""
        set(value){
            field = value.uppercase()
        }
        get(){
            return field
        }

    var edad: Int = 0
        set(value){
            //nos ayuda a evitar valores negativos

            if (value >=0){
                field = value
            } else{
                field = 0
            }
        }

    //en la línea inmediatamente siguiente se asignan los set y get, no lleva la palabra clave fun
    //el value tiene el mismo tipo de datos que la variable
    //se pueden editar los datos dentro de los getter an setters
}

fun main(){
    val persona1 = Persona()
    persona1.nombre = "Andrea Peña"
    persona1.edad = 16
    println("${persona1.nombre}  \n ${persona1.edad}")

}

/*1. pedir #clientes
2. add c/u de los clientes = nombre, saldo y doc (opcional) xd
3. acciones = consignar, retirar, consultar saldo y salir -> con validaciones
4. saca los totales cuando me salgo
 */

