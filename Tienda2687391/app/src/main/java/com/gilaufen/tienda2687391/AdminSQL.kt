package com.gilaufen.tienda2687391

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteDatabase.CursorFactory
import android.database.sqlite.SQLiteOpenHelper

//usamos funciones especiales para poder crear la base de datos, para usar la libreria SQLite necesitamos
//mandarle 4 parametros que son los mismo que pusimos cuando creamos la clase

//necesitamos implementar 2 métodos abastractros que vienen con SQLite
//cuando hacemos un llamado en kotlin usamos un signo de interrogacion al final, en este caso en el cursor

class AdminSQL(contexto:Context, nombre:String, cursor:CursorFactory?, version: Int): SQLiteOpenHelper(contexto, nombre, cursor, version) {
    fun obtenerTodosLosProductos(): List<Producto> {
        val productos = mutableListOf<Producto>()
        val db = this.writableDatabase

        val consulta = db.rawQuery("SELECT * FROM producto", null)

        while (consulta.moveToNext()) {
            val codigo = consulta.getInt(consulta.getColumnIndexOrThrow("codigo"))
            val nombre = consulta.getString(consulta.getColumnIndexOrThrow("nombre"))
            val precio = consulta.getFloat(consulta.getColumnIndexOrThrow("precio"))

            val producto = Producto(codigo, nombre, precio)
            productos.add(producto)
        }


        consulta.close()
        db.close()

        return productos
    }

    override fun onCreate(db: SQLiteDatabase?) {
        //ejecutar un sql :p, y de paso creamos la base de datos con lenguaje sql, el real es un decimal xd
        db?.execSQL("create table producto(codigo INTEGER primary key, nombre varchar(50), precio real)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        //si queremos hacer un cambio en la base de datos así como un nombre
    }


}