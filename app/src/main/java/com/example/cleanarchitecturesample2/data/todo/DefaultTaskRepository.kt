package com.example.cleanarchitecturesample2.data.todo

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import kotlinx.coroutines.flow.Flow

class DefaultTaskRepository(
    private val remoteDataSource: RemoteTaskDataSource,
    private val localDataSource: LocalTaskDataSource,
) : TaskRepository {
    override fun getTasks(): Flow<Result<List<Task>, Error>> {
        TODO("Not yet implemented")
    }

    override fun getTask(): Flow<Result<Task, Error>> {
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