package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll_button:Button = findViewById(R.id.roll_button)
        roll_button.text = "let/'s roll this"
        roll_button.setOnClickListener {
            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT).show()
            roll_dice()
        }


    }

    private fun roll_dice(){

        val diceImage = findViewById<ImageView>(R.id.dice_image)
        val randomInt = Random().nextInt(6) + 1

        val diceImageID = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.dice_1
        }

        diceImage.setImageResource(diceImageID)
    }
}
