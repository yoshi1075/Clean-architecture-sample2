package com.example.cleanarchitecturesample2.data_source.todo.local

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.cleanarchitecturesample2.domain.todo.model.Task

@Entity(tableName = "tasks")
data class TaskEntity(
    @PrimaryKey
    val id: Int,
    val title: String,
    val isCompleted: Boolean,
) {
    fun toTask(): Task {
        return Task(id, title, isCompleted)
    }
}
