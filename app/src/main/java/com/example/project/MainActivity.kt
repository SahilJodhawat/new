package com.example.project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val editText:EditText=findViewById(R.id.edt_txt)
        val snd_btn:Button=findViewById(R.id.snd_btn)
        snd_btn.setOnClickListener {
            intent = Intent(this@MainActivity, SecondActivity::class.java)
            val value:String=editText.text.toString()
            intent.putExtra("value",value)
            startActivity(intent)
        }


    }
}