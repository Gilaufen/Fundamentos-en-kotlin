package com.gilaufen.newproyect.taller1

class Cuenta (var nombre:String, var apellido:String, var saldo: Int, var documento:Long ){

    fun consignarDinero(ingreso:Int){
        if(ingreso <= 500000) {
            this.saldo += ingreso
        }else{
            println("No se pueden ingresar más de $500000 pesos")
        }
    }

    fun retirarDinero(retiro:Int){
        if(retiro < saldo){
            this.saldo -= retiro
        } else {
            println("No tiene la cantidad de dinero suficiente para retirar, en total quiere sacar ${retiro} pero cuenta con ${saldo}")
        }
    }

    fun ConsultarSaldo() {
        println("Su saldo es de $${this.saldo} pesos")
    }
}
