package com.example.studyproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()

        btnFluxoContador.setOnClickListener {
            val intent = Intent(this, ContadorActivity::class.java)
            startActivity(intent)
        }

        btnFluxoNomeador.setOnClickListener{
            val intent = Intent(this, NomeadorActivity::class.java)
            startActivity(intent)
        }


        btnFluxoCalculadora.setOnClickListener{
            val intent = Intent(this, CalculadoraActivity::class.java)
            startActivity(intent)
        }

        btnFluxoLuz.setOnClickListener {
            val intent = Intent(this, LuzActivity::class.java)
            startActivity(intent)
        }
    }
}
