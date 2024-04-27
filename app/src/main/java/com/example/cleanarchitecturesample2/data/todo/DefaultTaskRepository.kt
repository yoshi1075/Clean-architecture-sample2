package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository

class DefaultTaskRepository(
    private val remoteDataSource: RemoteTaskDataSource,
    private val localDataSource: LocalTaskDataSource,
) : TaskRepository {
    override suspend fun getTasks(): Result<List<Task>, Error> {
        return when (val remoteData = remoteDataSource.getTasks()) {
            is Result.Success -> {
                remoteData
            }

            is Result.Failure -> {
                localDataSource.getTasks()
            }
        }
    }

    override suspend fun getTask(todoId: Int): Result<Task, Error> {
        return when (val remoteData = remoteDataSource.getTask(todoId)) {
            is Result.Success -> {
                remoteData
            }

            is Result.Failure -> {
                localDataSource.getTask(todoId)
            }
        }
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