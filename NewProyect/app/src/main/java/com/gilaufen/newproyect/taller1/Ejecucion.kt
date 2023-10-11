package com.gilaufen.newproyect.taller1

fun main(){
    var salir: Boolean = false

    println("♦ Bienvenidos al banco Colpatria ♣")

    println("¿Cuantos cientes tiene el banco?")
    var cantidad: Int = readln().toInt()
    var usersList = mutableListOf<UsuarioCuenta>()

    println("Vamos a ingresar primero los clientes")

    for (i in 1..cantidad){
        println("Ingrese el nombre del cliente ${i}")
        var nombre = readln()
        println("Ingrese el apellido del cliente ${i}")
        var apellido = readln()
        println("Ingrese el número de documento del cliente ${i}")
        var numDocumento = readln().toLong()

        var usuario: UsuarioCuenta= UsuarioCuenta(nombre, apellido, 0, numDocumento)
        usersList.add(usuario);
    }

        while (salir==false) {
            println("¿Qué cliente desea seleccionar? esciba su posición")
            var posicion: Int= readln().toInt()

            println("¿Qué desea hacer? \n1.Consignar \n2.Retirar \n3.Consultar el Saldo \n4.salir")
            var eleccion: Int = readln().toInt()

            when (eleccion) {

                1 ->{
                    println("¿Cuanto dinero desea consignar?")
                    var ingreso:Int = readln().toInt()
                    usersList[posicion].consignarDinero(ingreso)
                    println(usersList[posicion].saldoUsuario)
                }
                2 -> {
                    println("¿Cuanto dinero desea retirar?")
                    var retiro:Int = readln().toInt()
                    usersList[posicion].retirarDinero(retiro)
                    println(usersList[posicion].saldoUsuario)
                }
                3 ->{
                    println(" ✿ஜீ۞ஜீ✿•.¸¸.•*`*•.•ஜீ☼۞ En total su saldo es de $${usersList[posicion].saldoUsuario} pesos ✿ஜீ۞ஜீ✿•.¸¸.•*`*•.•ஜீ☼۞")
                }
                4-> salir = true
            }
        }
        // println("Su saldo final fue de ${usersList[posicion].saldoUsuario}")

        var totalUsuarios:Int=0

        for (i in 0..(cantidad-1)){
            totalUsuarios += usersList[i].saldoUsuario
        }
        println("El total de todos los usuarios fue de ${totalUsuarios}")
}