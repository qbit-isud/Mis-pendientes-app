package com.aristidevs.androidmaster.todoapp

sealed class TaskCategory(var isSelected:Boolean = true) {
    object Personal : TaskCategory()
    object Universidad : TaskCategory()
    object Other : TaskCategory()
}
