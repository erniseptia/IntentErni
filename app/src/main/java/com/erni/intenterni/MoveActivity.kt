package com.erni.intenterni

import android.content.Intent
import android.graphics.pdf.PdfDocument
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.content.ContextCompat.startActivity

class MoveActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnBackToMainPage: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move)

        btnBackToMainPage = findViewById(R.id.btn_backto_main_page)
        btnBackToMainPage.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v != null) {
            when (v.id) {
                R.id.btn_backto_main_page -> run {
                    val intent = Intent(this, BackToMainPage::class.java)
                    startActivity(intent)
                }
            }
        }
    }

}

class BackToMainPage {

}





