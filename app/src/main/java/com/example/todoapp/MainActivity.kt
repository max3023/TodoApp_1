package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

// 1-ое (главное) актвити - экран отображения добавленных задач в To-do

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Функция для кнопки добавления задачи (переход на 2-ое активити)
    fun buttMeAddTask (view: View){
        val Intent = Intent (this, SecondActivity::class.java)
        startActivity(Intent)
    }
}