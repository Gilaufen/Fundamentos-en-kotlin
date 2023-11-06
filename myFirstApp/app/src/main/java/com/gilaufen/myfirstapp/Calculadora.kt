package com.gilaufen.myfirstapp

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
        val botoncalcular = findViewById<Button>(R.id.buttonCal)

        botoncalcular.setOnClickListener {
            var suma = numero1.text.toString().toInt() + numero2.text.toString().toInt()
            suma.toString()
            resultadoBox.setText(suma)
        }

    }
}