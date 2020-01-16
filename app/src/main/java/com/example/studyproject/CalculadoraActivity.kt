package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calculadora.*
import java.lang.Double.parseDouble

class CalculadoraActivity : AppCompatActivity() {

    var resultado = 0.0
    //var toast:Toast = Toast.makeText(Contexto,Toast.len

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora)
    }

    override fun onStart() {
        super.onStart()

        btnSoma.setOnClickListener {

            resultado = parseDouble(edtNum1.text.toString()) + parseDouble(edtNum2.text.toString())

            txtValor.text = resultado.toString()

        }

        btnSubtrair.setOnClickListener {

            resultado = parseDouble(edtNum1.text.toString()) - parseDouble(edtNum2.text.toString())

            txtValor.text = resultado.toString()
        }

        btnDividir.setOnClickListener {

            resultado = parseDouble(edtNum1.text.toString()) / parseDouble(edtNum2.text.toString())

            txtValor.text = resultado.toString()
        }

        btnMultiplicar.setOnClickListener {

            resultado = parseDouble(edtNum1.text.toString()) * parseDouble(edtNum2.text.toString())

            txtValor.text = resultado.toString()
        }


    }
}
