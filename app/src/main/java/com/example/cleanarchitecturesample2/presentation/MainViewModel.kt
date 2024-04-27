package com.example.cleanarchitecturesample2.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.cleanarchitecturesample2.domain.common.Result
import com.example.cleanarchitecturesample2.domain.todo.model.Task
import com.example.cleanarchitecturesample2.domain.todo.use_case.GetTasksUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel(
    private val getTasks: GetTasksUseCase
) : ViewModel() {
    private var _tasks =  mutableStateOf<List<Task>>(emptyList())
    private var _errorMessage = mutableStateOf("")
    val tasks = _tasks
    val errorMessage = _errorMessage

    fun onClick(shouldSuccess: Boolean = true) {
        viewModelScope.launch {
            if (shouldSuccess) {
                when (val result = getTasks()) {
                    is Result.Success -> {
                        _tasks.value = result.data
                    }
                    is Result.Failure -> {
                        _errorMessage.value = result.error.toString()
                    }
                }
            } else {
                delay(1000L)
                _errorMessage.value = "Error Occurred"
            }
        }
    }

    fun clearErrorMessage() {
        _errorMessage.value = ""
    }
}

class MainViewModelFactory(private val getTasks: GetTasksUseCase) : ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(getTasks) as T
        }
        throw (IllegalArgumentException("Unknown ViewModel Class"))
    }
}
