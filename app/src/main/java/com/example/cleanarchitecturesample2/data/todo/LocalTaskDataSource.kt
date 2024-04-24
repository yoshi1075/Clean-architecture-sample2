package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface LocalTaskDataSource {
    fun getTasks(): Flow<Result<List<Task>, DataError.LocalError>>
    fun getTask(): Flow<Result<Task, DataError.LocalError>>
    suspend fun addTask(task: Task): Result<Nothing, DataError.LocalError>
    suspend fun updateTask(task: Task): Result<Nothing, DataError.LocalError>
    suspend fun deleteTask(): Result<Nothing, DataError.LocalError>
}
