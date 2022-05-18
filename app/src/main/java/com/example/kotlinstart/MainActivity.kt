package com.example.kotlinstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var dog = SuperDog.superDog.copy("Почти супер")
    val cycles = Cycles()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        initButton()
        initTextView();
    }

    private fun initButton() {
        val button: Button = findViewById(R.id.button_click_on_me)
        button.setOnClickListener{
            Toast.makeText(this, "You click on me!", Toast.LENGTH_SHORT).show()
        }
    }

    private fun initTextView() {
        var speciesDog: TextView = findViewById(R.id.text_species)
        var nameDog: TextView = findViewById(R.id.text_name)
        speciesDog.text = dog.species
        nameDog.text = dog.name
    }


}