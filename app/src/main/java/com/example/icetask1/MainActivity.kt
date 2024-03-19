package com.example.icetask1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Write code Here
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)
        val tableNumberEditText = findViewById<EditText>(R.id.TableNumberEditText)


        multiplyButton.setOnClickListener {
        // Create the Explicit Intent
            val intent = Intent(this, MultiplicationTable1::class.java)

        // add the table number to the intent
             intent.putExtra("tableNumber", tableNumberEditText.text.toString())

        // Start your Activity
        startActivity(intent)

        }

    }
}