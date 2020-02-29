package com.ittrainingmm.ucsmwa

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class ToDoEntity(

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "description")
    var description: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}