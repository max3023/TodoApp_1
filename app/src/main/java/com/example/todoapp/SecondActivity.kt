package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

// 2-ое активити - экран добавления новой задачи

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    // Функция для кнопки возврата на 1-ое (главное) активити
    fun buttMeReturn1 (view: View){
        val Intent = Intent (this, MainActivity::class.java)
        startActivity(Intent)
    }
}