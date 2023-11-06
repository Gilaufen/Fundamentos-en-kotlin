package com.gilaufen.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val calculadora = findViewById<Button>(R.id.butCal)
        val cajero = findViewById<Button>(R.id.butCaj)
        val perfil = findViewById<Button>(R.id.butPer)
        val salir = findViewById<Button>(R.id.butSalir)

        calculadora.setOnClickListener{
            val intento1 = Intent(this,Calculadora::class.java)
            startActivity(intento1)
        }
        cajero.setOnClickListener{
            val intento2 = Intent(this,Ventana2::class.java)
            startActivity(intento2)
        }
        salir.setOnClickListener{
            val intento3 = Intent(this,MainActivity::class.java)
            startActivity(intento3)
        }

    }
}