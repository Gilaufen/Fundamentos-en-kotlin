package com.gilaufen.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)

        val numero1= findViewById<EditText>(R.id.numero1)
        val numero2= findViewById<EditText>(R.id.numero2)
        val resultadoBox = findViewById<TextView>(R.id.resultCal)
        val botoncal = findViewById<Button>(R.id.buttonCal)
        val botonVolver = findViewById<Button>(R.id.volver)

        botoncal.setOnClickListener {
            var suma = numero1.text.toString().toInt() + numero2.text.toString().toInt()
            suma.toString()
            resultadoBox.setText("$suma")
        }

        botonVolver.setOnClickListener {
            val intento = Intent(this,Menu::class.java)
            startActivity(intento)
        }

    }
}