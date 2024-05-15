package com.example.cleanarchitecturesample2.presentation

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cleanarchitecturesample2.data.todo.DefaultTaskRepository
import com.example.cleanarchitecturesample2.data_source.todo.local.DefaultLocalTaskDataSource
import com.example.cleanarchitecturesample2.data_source.todo.local.TaskDataBase
import com.example.cleanarchitecturesample2.data_source.todo.remote.DefaultRemoteTaskDataSource
import com.example.cleanarchitecturesample2.domain.todo.use_case_iml.GetTasksUseCaseImpl

class MainActivity : ComponentActivity() {
    private val viewModel: MainViewModel by viewModels {
        val remoteTaskDataSource = DefaultRemoteTaskDataSource()
        val localTaskDataSource = DefaultLocalTaskDataSource(
            TaskDataBase.getInstance(this).taskDao
        )
        val taskRepository =  DefaultTaskRepository(
            remoteTaskDataSource,
            localTaskDataSource
        )
        MainViewModelFactory(
            GetTasksUseCaseImpl(taskRepository)
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val tasks = remember { viewModel.tasks }
            val errorMessage = remember { viewModel.errorMessage }
            val context = LocalContext.current

            if (errorMessage.value.isNotBlank()) {
                Toast.makeText(context, errorMessage.value, Toast.LENGTH_SHORT).show()
                viewModel.clearErrorMessage()
            }

            LazyColumn(
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = 20.dp)
            ) {
                item {
                    Button(
                        onClick = {
                            viewModel.onClick()
                        },
                        modifier = Modifier.padding(10.dp)
                    ) {
                        Text(
                            text = "fetch",
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(50.dp)
                                .wrapContentHeight(align = Alignment.CenterVertically),
                        )
                    }
                    Divider(thickness = 4.dp, color = Color.Black)
                    Spacer(modifier = Modifier.height(12.dp))
                    tasks.value.forEach {
                        Text(
                            text = it.title,
                            fontSize = 16.sp,
                        )
                        Divider(modifier = Modifier.padding(4.dp))
                    }
                }
            }
        }
    }
}
