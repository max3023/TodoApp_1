package com.example.todoapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


// Класс принимает фактический список элементов Kotlin, которыми надо заполнить список
// Класс TodoAdapter отвечает за работу RecyclerView, содержит основную логику приложения
class TodoAdapter (val todos: MutableList<ToDo>) :
    RecyclerView.Adapter<TodoAdapter.TodoViewHolder>() {  // список того, что нужно сделать

    // Создаю ViewHolder
    class TodoViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    // Android Studio сам подсказал вставить функции ниже
    // onCreateViewHolder создает новый ViewHolder
    // Функция определяет, как будет выглядеть конкретный элемент в списке
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        return TodoViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        )
    }

    // Работа кнопки "Добавить задачу"
    fun addTodo(todo: ToDo) {
        todos.add(todo)
    }

    // Работа кнопки "Удалить задачу"
    fun deleteDoneTodos() {
        todos.removeAll { toDo ->
            todo.isChecked
        }
    }

    // В этой функции определяем какой текст хотим установить для TextView (toDoName)
    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        val curTodo = todos[position]
        holder.itemView.apply {
            toDoName.text = curTodo.name
            checkBoxDone.isChecked = curTodo.isChecked
        }
    }

    // Эта функция возвращает количество элементов, которые есть в списке
    // Эта информация пригодится для того, чтобы знать, сколько элементов надо отобразить
    override fun getItemCount(): Int {
        return todos.size

    }
}