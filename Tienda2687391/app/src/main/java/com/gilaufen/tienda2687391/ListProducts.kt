package com.gilaufen.tienda2687391

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast

class ListProducts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_products)

        //para el botón de volver
        val buttonVolver = findViewById<Button>(R.id.VolverMain);


        // Crear una instancia de AdminSQL
        val adminDB = AdminSQL(this, "TiendaEucas", null, 1)

        // Obtener la lista de productos usando la función de AdminSQL
        val listaDeProductos = adminDB.obtenerTodosLosProductos()

        if(listaDeProductos === null){
            Toast.makeText(this,"No hay ningún producto", Toast.LENGTH_LONG).show()
            val intento1 = Intent(this,MainActivity::class.java)
            startActivity(intento1)
        }else{
            val listView = findViewById<ListView>(R.id.listViewProductos)
            val adapter = ArrayAdapter<Producto>(this, android.R.layout.simple_list_item_1, listaDeProductos)
            listView.adapter = adapter
        }

        buttonVolver.setOnClickListener {
            val intento1 = Intent(this,MainActivity::class.java)
            startActivity(intento1)
        }

    }
}