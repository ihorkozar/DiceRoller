package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_btn)
        diceImage = findViewById(R.id.dice_img)
        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {
        val resource = when (Random.nextInt(1,6)){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else ->  R.drawable.dice_6
        }
        diceImage.setImageResource(resource)
    }
}
