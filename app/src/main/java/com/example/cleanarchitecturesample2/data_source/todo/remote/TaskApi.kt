package com.example.cleanarchitecturesample2.data_source.todo.remote

import com.example.cleanarchitecturesample2.domain.todo.model.Task
import retrofit2.Response
import retrofit2.http.DELETE
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path

interface TaskApi {
    @GET("todos")
    suspend fun getTasks(): Response<ApiTasks>

    @GET("todos/{id}")
    suspend fun getTask(@Path("id") todoId: Int): Response<ApiTask>

    @POST("todos/add")
    suspend fun addTask(task: Task): Response<ApiTask>

    @PUT("todos/{id}")
    suspend fun updateTask(task: Task): Response<ApiTask>

    @DELETE("todos/{id}")
    suspend fun deleteTask(): Response<ApiTask>
}
