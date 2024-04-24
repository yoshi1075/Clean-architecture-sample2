package com.example.cleanarchitecturesample2.domain.todo.use_case

interface UpdateTaskUseCase {
    suspend operator fun invoke(
        id: Int,
        title: String,
        isCompleted: Boolean
    ): Boolean
}
