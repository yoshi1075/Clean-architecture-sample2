package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.todo.model.Task

interface GetTasksUseCase {
    suspend operator fun invoke(): List<Task>
}