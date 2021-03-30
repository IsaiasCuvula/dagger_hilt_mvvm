package com.bersyte.dagger_hilt_mvvm_yt.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.bersyte.dagger_hilt_mvvm_yt.model.ToDo
import com.bersyte.dagger_hilt_mvvm_yt.repository.ToDoRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TodoViewModel
@Inject
constructor(private val toDoRepository: ToDoRepository) : ViewModel() {

    fun insertToDo(toDo: ToDo) = viewModelScope.launch {
        toDoRepository.insertToDo(toDo)
    }

    fun deleteToDo(toDo: ToDo) = viewModelScope.launch {
        toDoRepository.deleteToDo(toDo)
    }

    val allToDos = toDoRepository.getAllToDo().asLiveData()

}
