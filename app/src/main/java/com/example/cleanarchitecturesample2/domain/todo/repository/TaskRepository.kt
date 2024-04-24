package com.example.cleanarchitecturesample2.domain.todo.repository

import com.example.cleanarchitecturesample2.domain.todo.model.Task

interface TaskRepository {
    suspend fun getTasks(): List<Task>
    suspend fun getTask(): Task
    suspend fun addTask(task: Task): Boolean
    suspend fun updateTask(task: Task): Boolean
    suspend fun deleteTask(): Boolean
}
