package com.example.cleanarchitecturesample2.data_source.todo.remote

import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT

interface TaskApi {
    @GET("todos")
    suspend fun getTasks(): Response<ApiTasks>

    @GET("todos/{id}")
    suspend fun getTask(): Response<ApiTask>

    @POST("todos/add")
    suspend fun addTask(task: Task): Response<Nothing>

    @PUT("todos/{id}")
    suspend fun updateTask(task: Task): Response<Nothing>

    @DELETE("todos/{id}")
    suspend fun deleteTask(): Response<Nothing>
}
