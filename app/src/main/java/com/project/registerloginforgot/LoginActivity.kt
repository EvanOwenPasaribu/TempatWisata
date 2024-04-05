package com.project.registerloginforgot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnRegister: Button
    lateinit var btnLupaPasswrod: TextView
    lateinit var etUsername: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnLogin = findViewById(R.id.btn_login)
        btnRegister = findViewById(R.id.btn_register)
        btnLupaPasswrod = findViewById(R.id.btn_lupa_password)
        etUsername = findViewById(R.id.et_username)
        etPassword = findViewById(R.id.et_password)

        btnLogin.setOnClickListener {
            if (etUsername.text.toString() == "") {
                Toast.makeText(this@LoginActivity, "Masukkan username", Toast.LENGTH_SHORT).show()
            } else if (etPassword.text.toString() == "") {
                Toast.makeText(this@LoginActivity, "Masukkan password", Toast.LENGTH_SHORT).show()
            } else if (etUsername.text.toString() == "liberty" && etPassword.text.toString() == "12345") {
                Toast.makeText(this@LoginActivity, "Anda berhasil login", Toast.LENGTH_SHORT).show()
                val intent = Intent(this@LoginActivity, MainActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK)
                startActivity(intent)
            } else {
                Toast.makeText(
                    this@LoginActivity,
                    "Username atau password anda salah",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
        btnRegister.setOnClickListener {
            val intent = Intent(this@LoginActivity, RegisterActivity::class.java)
            startActivity(intent)
        }
        btnLupaPasswrod.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgetPasswordActivity::class.java)
            startActivity(intent)
        }
    }
}