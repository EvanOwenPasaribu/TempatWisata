package com.project.registerloginforgot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class RegisterActivity : AppCompatActivity() {
    lateinit var btnBack : ImageView
    lateinit var btnRegister : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        btnBack= findViewById(R.id.btn_back)
        btnRegister= findViewById(R.id.btn_register)

        btnBack.setOnClickListener {
            finish()
        }

        btnRegister.setOnClickListener {
            Toast.makeText(this@RegisterActivity, "Anda berhasil register", Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}