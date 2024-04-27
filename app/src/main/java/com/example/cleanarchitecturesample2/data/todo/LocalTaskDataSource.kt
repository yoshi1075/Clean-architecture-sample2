package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface LocalTaskDataSource {
    suspend fun getTasks(): Result<List<Task>, DataError.LocalError>
    suspend fun getTask(id: Int): Result<Task, DataError.LocalError>
    suspend fun addTask(task: Task): Result<Nothing, DataError.LocalError>
    suspend fun updateTask(task: Task): Result<Nothing, DataError.LocalError>
    suspend fun deleteTask(): Result<Nothing, DataError.LocalError>
}
