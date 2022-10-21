package com.example.k3_3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but1 = findViewById<Button>(R.id.button1)
        val but2 = findViewById<Button>(R.id.button2)
        val etykieta1 = findViewById<TextView>(R.id.textView1)
        val etykieta2 = findViewById<TextView>(R.id.textView2)
        val textEtykiety1 = etykieta1.text.toString()

        but1.setOnClickListener {
            val text1 = findViewById<EditText>(R.id.edittext1).text.toString()
            //val textEtykiety2 = etykieta1.text.toString()
            etykieta2.text = etykieta2.text.toString() + text1
        }
        but2.setOnClickListener {
            etykieta1.text = "Giovanni"
            etykieta2.text = "Paolo"
        }
    }
}