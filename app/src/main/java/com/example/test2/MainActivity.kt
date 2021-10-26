package com.example.test2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var falseBotton:Button
    private lateinit var trueBotton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        falseBotton = findViewById(R.id.false_botton)
        trueBotton = findViewById(R.id.true_botton)

        falseBotton.setOnClickListener{
            Toast.makeText(this, R.string.incorrect_toast, Toast.LENGTH_LONG).show()
        }

        trueBotton.setOnClickListener{
            Toast.makeText(this, R.string.correct_toast, Toast.LENGTH_LONG).show()
        }

    }
}