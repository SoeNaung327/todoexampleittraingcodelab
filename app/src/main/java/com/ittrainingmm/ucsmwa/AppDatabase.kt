package com.ittrainingmm.ucsmwa

import android.content.Context
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [ToDoEntity::class],version = 1)
abstract class AppDatabase: RoomDatabase() {
    companion object{
        var instant:AppDatabase?=null
        fun invoke(context: Context):AppDatabase{
            if (instant==null)
            {
                instant= buildDatabase(context)
            }
            return instant!!
        }

        fun buildDatabase(context: Context)=Room.databaseBuilder(context,AppDatabase::class.java,"tododb").allowMainThreadQueries().build()
    }

    abstract  fun toDoDAO():ToDoDAO
}