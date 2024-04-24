package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.todo.model.Task

interface GetTaskUseCase {
    suspend operator fun invoke(id: Int): Task
}
