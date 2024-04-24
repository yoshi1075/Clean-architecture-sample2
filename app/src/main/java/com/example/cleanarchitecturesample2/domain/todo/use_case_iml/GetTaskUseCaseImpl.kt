package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.GetTaskUseCase
import kotlinx.coroutines.flow.Flow

class GetTaskUseCaseImpl(
    private val taskRepository: TaskRepository
) : GetTaskUseCase {
    override suspend fun invoke(id: Int): Flow<Result<Task, Error>> {
        return taskRepository.getTask()
    }
}
