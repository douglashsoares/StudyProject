package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_contador.*
import kotlinx.android.synthetic.main.activity_main.*

class ContadorActivity : AppCompatActivity() {

    var numero = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)
    }

    override fun onStart() {
        super.onStart()

        btnContar.setOnClickListener {
            txtContador.text = (++numero).toString()

        }
    }
}
