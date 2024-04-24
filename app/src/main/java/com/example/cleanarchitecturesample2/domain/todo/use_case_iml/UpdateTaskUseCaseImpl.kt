package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.UpdateTaskUseCase

class UpdateTaskUseCaseImpl(
    private val taskRepository: TaskRepository
) : UpdateTaskUseCase {
    override suspend fun invoke(id: Int, title: String, isCompleted: Boolean): Boolean {
        val task = Task(id, title, isCompleted)
        return taskRepository.updateTask(task)
    }
}
