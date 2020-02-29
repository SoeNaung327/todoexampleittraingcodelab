package com.ittrainingmm.ucsmwa

import androidx.room.*

@Dao
interface ToDoDAO {
    @Query("Select * from todo")
    fun getAll(): List<ToDoEntity>

    @Insert
    fun insertAll(vararg toDoEntity: ToDoEntity)

    @Delete
    fun deleteAll(toDoEntity: ToDoEntity)

    @Update
    fun updateAll(toDoEntity: ToDoEntity)
    @Query("Select * from todo where id=:id")
    fun  findById(id:Int):ToDoEntity
}