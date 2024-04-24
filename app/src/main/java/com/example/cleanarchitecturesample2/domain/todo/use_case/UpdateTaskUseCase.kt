package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result

interface UpdateTaskUseCase {
    suspend operator fun invoke(
        id: Int,
        title: String,
        isCompleted: Boolean
    ): Result<Nothing, Error>
}
