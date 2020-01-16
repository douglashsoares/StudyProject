package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_nomeador.*

class NomeadorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nomeador)
    }

    override fun onStart() {
        super.onStart()

        btnNomear.setOnClickListener {
            val nome = edtNome.text.toString()

            txtNome.text = nome
        }
    }
}
