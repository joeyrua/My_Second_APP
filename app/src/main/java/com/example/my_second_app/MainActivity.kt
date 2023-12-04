package com.example.my_second_app

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var SevenEleven:ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        SevenEleven = findViewById(R.id.SevenElevenImage)

        SevenEleven.setOnClickListener{
            val dialogBinding = layoutInflater.inflate(R.layout.popup_window,null)
            val myDialog = Dialog(this)
            myDialog.setContentView(dialogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()
            Toast.makeText(this,"7-11有你真好!!",Toast.LENGTH_SHORT).show()
        }
    }
}