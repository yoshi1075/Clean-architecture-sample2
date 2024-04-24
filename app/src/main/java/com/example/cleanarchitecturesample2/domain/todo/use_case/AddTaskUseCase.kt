package com.example.cleanarchitecturesample2.domain.todo.use_case

interface AddTaskUseCase {
    suspend operator fun invoke(title: String): Boolean
}
