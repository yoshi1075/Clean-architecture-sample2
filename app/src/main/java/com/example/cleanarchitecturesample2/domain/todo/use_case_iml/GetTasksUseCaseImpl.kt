package com.example.cleanarchitecturesample2.domain.todo.use_case_iml

import com.example.cleanarchitecturesample2.domain.common.Error
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.repository.TaskRepository
import com.example.cleanarchitecturesample2.domain.todo.use_case.GetTasksUseCase
import kotlinx.coroutines.flow.Flow

class GetTasksUseCaseImpl(
    private val taskRepository: TaskRepository
) : GetTasksUseCase {

    override fun invoke(): Flow<Result<List<Task>, Error>> {
        return taskRepository.getTasks()
    }
}
