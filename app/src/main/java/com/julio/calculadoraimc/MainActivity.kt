package com.julio.calculadoraimc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btnCalcular : Button
    private lateinit var edityPeso : EditText
    private lateinit var editAltura : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalcular = findViewById(R.id.btn_calcular)
        edityPeso = findViewById(R.id.input_peso)
        editAltura = findViewById(R.id.input_altura)

        btnCalcular.setOnClickListener {

            val intent = Intent(
                this,
                ResultadoActivity::class.java
            )

            val peso = edityPeso.text.toString()
            val  altura = editAltura.text.toString()
            if ( peso.isNotEmpty() && altura.isNotEmpty() ){

                intent.putExtra("peso", peso.toDouble())
                intent.putExtra("altura", altura.toDouble())

            }

            startActivity( intent )

        }

    }
}