package com.example.studyproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import kotlinx.android.synthetic.main.activity_luz.*

class LuzActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_luz)
    }

    override fun onStart() {
        super.onStart()

        switchBotao.setOnCheckedChangeListener{
            buttonView, isChecked ->
            if(isChecked){
                imgLuz.setImageResource(R.drawable.ic_light_on)
            }else{
                imgLuz.setImageResource(R.drawable.ic_light_off)
            }
        }





    }
}
