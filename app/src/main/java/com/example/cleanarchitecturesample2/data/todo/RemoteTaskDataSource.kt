package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface RemoteTaskDataSource {
    fun getTasks(): Flow<Result<List<Task>, DataError.NetworkError>>
    fun getTask(): Flow<Result<Task, DataError.NetworkError>>
    suspend fun addTask(task: Task): Result<Nothing, DataError.NetworkError>
    suspend fun updateTask(task: Task): Result<Nothing, DataError.NetworkError>
    suspend fun deleteTask(): Result<Nothing, DataError.NetworkError>
}
