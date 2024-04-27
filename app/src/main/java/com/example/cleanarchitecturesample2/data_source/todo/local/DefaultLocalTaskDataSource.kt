package com.example.cleanarchitecturesample2.data_source.todo.local

import com.example.cleanarchitecturesample2.data.todo.LocalTaskDataSource
import com.example.cleanarchitecturesample2.domain.common.DataError
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import java.lang.Exception

class DefaultLocalTaskDataSource(
    private val dao: TaskDao
) : LocalTaskDataSource {
    override suspend fun getTasks(): Result<List<Task>, DataError.LocalError> {
        return try {
            val data = dao.getTasks().map { it.toTask() }
            Result.Success(data)
        } catch (e: Exception) {
            Result.Failure(DataError.LocalError.TIMEOUT)
        }
    }

    override suspend fun getTask(id: Int): Result<Task, DataError.LocalError> {
        return try {
            val data = dao.getTask(id).toTask()
            Result.Success(data)
        } catch (e: Exception) {
            Result.Failure(DataError.LocalError.TIMEOUT)
        }
    }

    override suspend fun addTask(task: Task): Result<Nothing, DataError.LocalError> {
        TODO("Not yet implemented")
    }

    override suspend fun updateTask(task: Task): Result<Nothing, DataError.LocalError> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteTask(): Result<Nothing, DataError.LocalError> {
        TODO("Not yet implemented")
    }
}
