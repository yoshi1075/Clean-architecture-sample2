package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.DeleteTaskUseCase

class DeleteTaskUseCaseImpl(
    private val taskRepository: TaskRepository
) : DeleteTaskUseCase {
    override suspend fun invoke(id: Int): Result<Nothing, Error> {
        return taskRepository.deleteTask()
    }
}
