package com.example.cleanarchitecturesample2.domain.todo.repository

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface TaskRepository {
    suspend fun getTasks(): Result<List<Task>, Error>
    suspend fun getTask(todoId: Int): Result<Task, Error>
    suspend fun addTask(task: Task): Result<Nothing, Error>
    suspend fun updateTask(task: Task): Result<Nothing, Error>
    suspend fun deleteTask(): Result<Nothing, Error>
}
