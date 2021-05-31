package com.example.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentTransaction
import androidx.recyclerview.widget.LinearLayoutManager

// 1-ое (главное) актвити - экран отображения добавленных задач в To-do

class MainActivity : AppCompatActivity() {

    private lateinit var todoAdapter: TodoAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        todoAdapter = TodoAdapter(mutableListOf())

        rvTodoItems.adapter = todoAdapter
        rvTodoItems.layoutManager = LinearLayoutManager (this)

    }


    // Функция для кнопки добавления задачи (переход на фрагмент добавления задачи)
//    fun buttMeAddTask (view: View){
//        val buttonAddTask = findViewById<View>(R.id.buttonAddTask1)
//        val fragment = fragmentAddTask()
//        buttonAddTask.setOnClickListener {
//            supportFragmentManager.beginTransaction().replace(R.id.container, fragment).commit()
//        }

//        val intent = Intent (this, SecondActivity::class.java)
//        startActivity(intent)
}
