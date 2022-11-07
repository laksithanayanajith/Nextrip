package com.example.nextrip

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.auth.FirebaseAuth

class WelcomeActivity : AppCompatActivity() {

    private lateinit var firabaseAuth : FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        firabaseAuth = FirebaseAuth.getInstance()

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")

        findViewById<TextView>(R.id.txt_name).setText(name).toString()
    }
}