package com.example.cleanarchitecturesample2.domain.todo.use_case

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import kotlinx.coroutines.flow.Flow

interface GetTasksUseCase {
    suspend operator fun invoke(): Result<List<Task>, Error>
}
