package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface GetTaskUseCase {
    suspend operator fun invoke(id: Int): Flow<Result<Task, Error>>
}
