package com.example.cleanarchitecturesample2.domain.todo.repository

import com.example.cleanarchitecturesample2.domain.todo.model.Task

interface TaskRepository {
    suspend fun getTasks(): List<Task>
}
