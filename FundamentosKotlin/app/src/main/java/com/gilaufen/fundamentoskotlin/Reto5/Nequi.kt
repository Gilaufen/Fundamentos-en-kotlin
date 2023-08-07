package com.gilaufen.fundamentoskotlin.Reto5

import java.math.BigInteger

class Nequi {
}

fun main(){
    var usuario= mutableListOf<Long>(3142906782,2909,4500)
    var intentoi= mutableListOf<Long>()
    var intentos:Int=3
    var conf=false
    var codigo=(1..9)

    /*to Login*/
    while (conf==false && intentos>0){
    println("Ingrese su número de teléfono: ")
    var numero:Long= readLine()!!.toLong()
    intentoi.add(numero)
    println("Ingrese su código (4 números): ")
    numero= readLine()!!.toLong()
    intentoi.add(numero)
        if (usuario[0]==intentoi[0] && usuario[1]==intentoi[1]){
            println("Puede ingresar")
            conf=true
        }else{
            intentos--
            println("¡Upps! Parece que tus datos de acceso no son correctos, Tienes $intentos intentos más")
        }
        intentoi.clear()
    }
    /*if the input data is incorrect*/
    if(intentos==0){
        println("Ha gastado 3 intentos, no podrá ingresar volver a intentarlo")
    }

    /*if the input data is correct*/
    while (conf==true){
        /*Show available balance and funcionalities*/
        println("✧˚₊‧୭⁺‿︵ Su saldo actual es de ${usuario[2]} ‿︵⁺୭‧₊˚✧")

        println("Elija que desea hacer: \n1.Saca Dinero \n2.Envía Dinero \n3.Recarga Dinero \n4.Salir de Nequi")
        var eleccion:Int= readLine()!!.toInt()
        when(eleccion){
            1->{
                if (usuario[2] < 2000){
                    println("No te alcanza el dinero")
                }else{
                    println("Tiene 2 opciones de retiro: \n1.Cajero \n2.Punto Físico")
                    var respuesta:Int= readLine()!!.toInt()
                    println("¿Cuanto desea retirar?")
                    respuesta= readLine()!!.toInt()
                    usuario[2]=usuario[2]-respuesta
                    println("Su código para retirar es:")
                    for (i in 1..6) {
                        print(codigo.random())
                    }
                    println("")
                }
            }
            2->{
                println("Ingrese el número de teléfono al cual desea enviar el dinero")
                var respuesta:Long= readLine()!!.toLong()
                println("Ingrese el valor a envíar")
                respuesta= readLine()!!.toLong()
                if (respuesta > usuario[2]){
                    println("No es posible envíar el dinero")
                }else{
                    usuario[2]-=respuesta
                }
            }
            3->{
                println("Ingrese el valor a recargar")
                var respuesta:Int= readLine()!!.toInt()
                println("¿Desea confirmar la recarga?")
                var res:String= readLine()!!.toString().lowercase()
                if (res=="si"){
                    usuario[2]=usuario[2]+respuesta
                }
            }
            4-> return
        }
    }

}