package com.example.cleanarchitecturesample2.data_source.todo.local

import androidx.room.Dao
import androidx.room.Query

@Dao
interface TaskDao {
    @Query("SELECT * from tasks")
    suspend fun getTasks(): List<TaskEntity>

    @Query("SELECT * from tasks WHERE id = :id")
    suspend fun getTask(id: Int): TaskEntity
}
