package com.bersyte.dagger_hilt_mvvm_yt.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.bersyte.dagger_hilt_mvvm_yt.db.ToDoDao
import com.bersyte.dagger_hilt_mvvm_yt.model.ToDo

@Database(
    entities = [ToDo::class],
    version = 1, exportSchema = false
)
abstract class ToDoDatabase : RoomDatabase() {

    abstract fun toDoDao(): ToDoDao

}