package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface RemoteTaskDataSource {
    suspend fun getTasks(): Flow<Result<List<Task>, DataError.NetworkError>>
    suspend fun getTask(): Flow<Result<Task, DataError.NetworkError>>
    suspend fun addTask(task: Task): Result<Nothing, DataError.NetworkError>
    suspend fun updateTask(task: Task): Result<Nothing, DataError.NetworkError>
    suspend fun deleteTask(): Result<Nothing, DataError.NetworkError>
}
