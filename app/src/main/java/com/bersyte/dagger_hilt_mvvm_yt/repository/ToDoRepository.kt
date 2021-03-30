package com.bersyte.dagger_hilt_mvvm_yt.repository

import com.bersyte.dagger_hilt_mvvm_yt.db.ToDoDao
import com.bersyte.dagger_hilt_mvvm_yt.model.ToDo
import javax.inject.Inject


class ToDoRepository
@Inject
constructor(private val toDoDao: ToDoDao) {

    suspend fun insertToDo(toDo: ToDo) = toDoDao.insertToDo(toDo)
    suspend fun deleteToDo(toDo: ToDo) = toDoDao.deleteToDo(toDo)
    fun getAllToDo() = toDoDao.getAllToDos()

}