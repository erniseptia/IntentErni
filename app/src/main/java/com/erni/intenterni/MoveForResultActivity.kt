package com.erni.intenterni

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.RadioGroup

class MoveForResultActivity : AppCompatActivity() {
    var rgActivity: RadioGroup? = null
    lateinit var radioButton: RadioButton
    private lateinit var btnCoose: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_for_result2)

        rgActivity = findViewById(R.id.rg_activity)
        btnCoose = findViewById(R.id.btn_choose)
        btnCoose.setOnClickListener{
            val selectedOption: Int = rgActivity!!.checkedRadioButtonId
            radioButton = findViewById(selectedOption)

            val intent = Intent(this, MainActivity::class.java)
            val bundle = Bundle()
            bundle.putString("Warna", radioButton.text as String?)
            intent.putExtras(bundle)
            startActivity(intent)


        }
    }
}