package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

class DefaultTaskRepository(
    private val remoteDataSource: RemoteTaskDataSource,
    private val localDataSource: LocalTaskDataSource,
) : TaskRepository {
    override suspend fun getTasks(): Result<List<Task>, Error> {
        TODO("Not yet implemented")
    }

    override suspend fun getTask(): Result<Task, Error> {
        TODO("Not yet implemented")
    }

    override suspend fun addTask(task: Task): Result<Nothing, Error> {
        TODO("Not yet implemented")
    }

    override suspend fun updateTask(task: Task): Result<Nothing, Error> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTask(): Result<Nothing, Error> {
        TODO("Not yet implemented")
    }
}