package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.AddTaskUseCase

class AddTaskUseCaseImpl(
    private val taskRepository: TaskRepository
) : AddTaskUseCase {
    override suspend fun invoke(title: String): Result<Nothing, Error> {
        val task = Task(0, title, false)
        return taskRepository.addTask(task)
    }
}
