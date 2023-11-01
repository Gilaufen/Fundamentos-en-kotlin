package com.gilaufen.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Ventana2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ventana2)

        val dineroSacar= findViewById<EditText>(R.id.editTextNumber2)
        val dineroIngresar= findViewById<EditText>(R.id.editTextNumber3)
        val saldoActual= findViewById<TextView>(R.id.textView5)
        val botonSacar = findViewById<Button>(R.id.button2)
        val botonIngresar = findViewById<Button>(R.id.button2)

        botonSacar.setOnClickListener {
            var resultadoResta = dineroSacar.text.toString().toInt() + saldoActual.text.toString().toInt()
            saldoActual.setText("$resultadoResta")
        }

        botonIngresar.setOnClickListener {
            var resultadoSuma = dineroIngresar.text.toString().toInt() + saldoActual.text.toString().toInt()
            saldoActual.setText("$resultadoSuma")
        }
    }
}