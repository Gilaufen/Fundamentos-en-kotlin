package com.gilaufen.myfirstapp

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numero = findViewById<EditText>(R.id.editTextPhone)
        val botonRegistrar = findViewById<Button>(R.id.button)
        val botonSalir = findViewById<Button>(R.id.salir)

        botonRegistrar.setOnClickListener {
            var numeroRecogido =  numero.text.toString()
            Toast.makeText(this, "Tu número de celular es ${numeroRecogido}, ¡Bienvenido a mi Nequi!", Toast.LENGTH_LONG).show()
            val ingresar = Intent(this,Menu::class.java)
            startActivity(ingresar)
        }

        botonSalir.setOnClickListener {
            val ingresar = Intent(this,Menu::class.java)
            startActivity(ingresar)
        }



    }
}