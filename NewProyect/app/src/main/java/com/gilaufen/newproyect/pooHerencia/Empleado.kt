package com.gilaufen.newproyect.pooHerencia

//para heredar una clase usamos el nombre de la clase padre después de dos puntos y definir los parametros que va a recibir
class Empleado(nombre: String, edad: Int, val sueldo: Double): Persona(nombre,edad) {

    //metodos heredados de otro lado se hace con override, se pueden agregar más funciones como el print en este caso
    override fun imprimir() {
        super.imprimir()
        println("sueldo: ${sueldo}")
    }

    fun impuesto(){
        if(sueldo > 5000000){
            println("¡Debe pagar Impuestos!")
        } else{
            println("¡NO Debe pagar Impuestos!")
            println("tu ere pobre tu no tiene aifon")
        }
    }
}