package com.example.cleanarchitecturesample2.data_source.todo.remote

import com.example.cleanarchitecturesample2.data.todo.RemoteTaskDataSource
import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class DefaultRemoteTaskDataSource(
    moshi: Moshi =
        Moshi.Builder()
            .add(KotlinJsonAdapterFactory())
            .build(),
    private val apiClient: TaskApi =
        Retrofit.Builder()
            .baseUrl("https://dummyjson.com")
            .addConverterFactory(MoshiConverterFactory.create(moshi))
            .build()
            .create(),
) : RemoteTaskDataSource {
    override suspend fun getTasks(): Result<List<Task>, DataError.NetworkError> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(todoId: Int): Result<Task, DataError.NetworkError> {
        TODO("Not yet implemented")
    }

    override suspend fun addTask(task: Task): Result<Nothing, DataError.NetworkError> {
        TODO("Not yet implemented")
    }

    override suspend fun updateTask(task: Task): Result<Nothing, DataError.NetworkError> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTask(): Result<Nothing, DataError.NetworkError> {
        TODO("Not yet implemented")
    }
}