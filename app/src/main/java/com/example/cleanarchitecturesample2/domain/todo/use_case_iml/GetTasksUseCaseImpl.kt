package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.GetTasksUseCase

class GetTasksUseCaseImpl(
    private val taskRepository: TaskRepository
) : GetTasksUseCase {
    override suspend fun invoke(): List<Task> {
        return taskRepository.getTasks()
    }
}
