package com.gilaufen.newproyect.taller1

class UsuarioCuenta (var nombre:String, var apellido:String, var saldo: Int, var documento:Long ) {

    var nombreUsuario:String = nombre
        set(value) {
            if(value == null){
                field = value
            }else{
                field = "name"
            }

        }
        get(){
            return field
        }

    var apellidoUsuario:String = apellido
        set(value) {
            if(value == null){
                field = value
            }else{
                field = "lastname"
            }
        }
        get(){
           return field
        }

    var saldoUsuario: Int = saldo
        set(value) {
            if(value >=0){
                field = value
            }else{
                field = 0
            }
        }
        get(){
            return field
        }

    var docUsu: Long = documento
        set(value) {
            if(value == null){
                field = value
            }else{
                field = 1010000000
            }
        }
        get() {
            return field
        }

    fun consignarDinero(ingreso:Int){
        if(ingreso <= 500000) {
            this.saldoUsuario += ingreso
        }else{
            println("No se pueden ingresar más de $500000 pesos")
        }
    }

    fun retirarDinero(retiro:Int){
        if(retiro < saldoUsuario){
            this.saldoUsuario -= retiro
        } else {
            println("No tiene la cantidad de dinero suficiente para retirar, en total quiere sacar ${retiro} pero cuenta con ${saldoUsuario}")
        }
    }

    fun ConsultarSaldo() {
        println("Su saldo es de $${this.saldoUsuario} pesos")
    }
}
