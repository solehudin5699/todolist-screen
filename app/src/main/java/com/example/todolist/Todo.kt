package com.example.todolist

data class Todo(var todoTitle: String, var isCheckedTodo : Boolean=false) {
    var title:String = todoTitle
    var isChecked:Boolean=isCheckedTodo
}