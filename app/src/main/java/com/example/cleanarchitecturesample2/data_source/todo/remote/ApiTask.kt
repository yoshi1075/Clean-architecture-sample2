package com.example.cleanarchitecturesample2.data_source.todo.remote

import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiTask(
    val completed: Boolean,
    val id: Int,
    val todo: String,
    val userId: Int
) {
    fun toDomain(): Task = Task(id, todo, completed)
}
