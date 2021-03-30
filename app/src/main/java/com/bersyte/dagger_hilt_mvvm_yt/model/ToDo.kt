package com.bersyte.dagger_hilt_mvvm_yt.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "todo")
data class ToDo(
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val toDoTitle: String
)
