package com.example.cleanarchitecturesample2.domain.todo.use_case

interface DeleteTaskUseCase {
    suspend operator fun invoke(id: Int): Boolean
}
