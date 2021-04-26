package com.example.loot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        signIn()
    }

    private fun signIn() {
        val username = findViewById<EditText>(R.id.username_)
        val password = findViewById<EditText>(R.id.password_)
        val loginButton = findViewById<Button>(R.id.LoginButton)
        // val signUp = findViewById<TextView>(R.id.SignUpLink)
        // val forgotPassword = findViewById<TextView>(R.id.ForgotPasswordLink)

        loginButton.setOnClickListener() {
            if (username.text.toString().isNullOrEmpty() || password.text.toString().isNullOrEmpty()){
                Toast.makeText(this, "Username or Password is not provided", Toast.LENGTH_LONG).show()}
            else if(username.text.toString()=="username" && password.text.toString()=="password"){
                val intent = Intent(this, DashboardActivity::class.java)
                startActivity(intent) }
            else {
                Toast.makeText(this, "Wrong username or password", Toast.LENGTH_LONG).show()
            }
        }

    }
}