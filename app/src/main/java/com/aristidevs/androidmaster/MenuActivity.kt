package com.aristidevs.androidmaster

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.aristidevs.androidmaster.imccalculator.ImcCalculatorActivity
import com.aristidevs.androidmaster.settings.SettingsActivity
import com.aristidevs.androidmaster.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        val btnImcApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODO = findViewById<Button>(R.id.btnTODO)

        val btnSettings = findViewById<Button>(R.id.btnSettings)


        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnTODO.setOnClickListener { navigateToTodoApp() }

        btnSettings.setOnClickListener { navigateToSettings() }
    }

    private fun navigateToSettings() {
        val intent = Intent(this, SettingsActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTodoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }




}