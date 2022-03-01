package com.example.popupdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.widget.PopupMenu

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.popupButton).setOnClickListener {
            val popup = PopupMenu(this, it)
            popup.menu.add("Menu Item 1")
            popup.menu.add("Menu Item 2")
            popup.show()
        }
    }
}