package com.gilaufen.newproyect.pooComplementos

enum class datosCartas(val numCarta: Array<Any> = arrayOf<Any>()) {

    //si las definimos así las toma como cadenas automáticamente = DIAMANTE
    //pero también las podemos definir como arreglos

    DIAMANTE( arrayOf<Any>("A",2,3,4,5,6,7,8,9,10,11,12)),
    TREBOL(arrayOf<Any>("A",2,3,4,5,6,7,8,9,10,11,12)),
    CORAZON(arrayOf<Any>("A",2,3,4,5,6,7,8,9,10,11,12)),
    PICA(arrayOf<Any>("A",2,3,4,5,6,7,8,9,10,11,12))

}