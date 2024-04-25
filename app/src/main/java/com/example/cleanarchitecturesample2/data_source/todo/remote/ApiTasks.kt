package com.example.cleanarchitecturesample2.data_source.todo.remote

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ApiTasks(
    val todos: List<ApiTask>
) {
    fun toDomain() = todos.map { it.toDomain() }
}
