package com.example.utsmobile

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var inputText: EditText
    private lateinit var displayText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.inputText)
        displayText = findViewById(R.id.displayText)
    }

    fun showText(view: View) {
        val userInput = inputText.text.toString()
        displayText.text = "Teks yang diinputkan: $userInput"
    }
}

