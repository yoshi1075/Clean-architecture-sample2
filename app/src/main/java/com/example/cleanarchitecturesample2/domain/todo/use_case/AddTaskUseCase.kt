package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result

interface AddTaskUseCase {
    suspend operator fun invoke(title: String): Result<Nothing, Error>
}
