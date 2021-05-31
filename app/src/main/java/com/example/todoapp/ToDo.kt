package com.example.todoapp

// Создаю класс данных для хранения данных каждого элемента
// Name - название задачи,isChecked - проверка, выполнена ли задача
data class ToDo (val name: String, val isChecked: Boolean = false)