package com.project.registerloginforgot

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class ForgetPasswordActivity : AppCompatActivity() {
    lateinit var btnBack : ImageView
    lateinit var btnReset : Button
    lateinit var etEmail : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forget_password)
        btnBack= findViewById(R.id.btn_back)
        btnReset = findViewById(R.id.btn_reset)
        etEmail = findViewById(R.id.et_email)

        btnBack.setOnClickListener {
            finish()
        }
        btnReset.setOnClickListener {
            if(etEmail.text.toString().isEmpty()){
                Toast.makeText(this@ForgetPasswordActivity, "Masukkan email", Toast.LENGTH_SHORT).show()
            }else if(!isValidEmail(etEmail.text.toString())){
                Toast.makeText(this@ForgetPasswordActivity, "Email tidak valid", Toast.LENGTH_SHORT).show()
            }else {
                Toast.makeText(this@ForgetPasswordActivity, "Link reset sudah dikirimkan ke email anda", Toast.LENGTH_SHORT).show()
            }
        }

    }
    fun isValidEmail(email: String): Boolean {
        val pattern = Patterns.EMAIL_ADDRESS
        return pattern.matcher(email).matches()
    }
}