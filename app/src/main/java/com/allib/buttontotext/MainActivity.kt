package com.allib.buttontotext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send button */
    fun sendMessage(view: View) {
        // Do something in response to button
        val idtest = view.id
        
    val clickedText = findViewById<Button>(idtest)
        val sentence = clickedText.text.toString()
       findViewById<TextView>(R.id.txtSentence).apply{
            text = sentence
        }
    }

}