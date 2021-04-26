package com.example.loot

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_dashboard)

        val dashboard = findViewById<ListView>(R.id.main_dashboard)
        val names = arrayOf("Kotlin", "Php", "Java", "C", "C++", "Python")

        val arrayAdapter: ArrayAdapter<String> = ArrayAdapter(
                this, android.R.layout.simple_list_item_1, names
        )

        dashboard.adapter = arrayAdapter

        dashboard.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "Item Selected " + names[i], Toast.LENGTH_LONG).show()
        }
    }
}