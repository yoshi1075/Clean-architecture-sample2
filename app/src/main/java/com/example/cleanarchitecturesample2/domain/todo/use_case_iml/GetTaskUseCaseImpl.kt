package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.GetTaskUseCase

class GetTaskUseCaseImpl(
    private val taskRepository: TaskRepository
) : GetTaskUseCase {
    override suspend fun invoke(id: Int): Task {
        return taskRepository.getTask()
    }
}
