package com.anything.service.implementation;

import com.anything.data.model.Task;
import com.anything.data.repository.TaskRepository;
import com.anything.dtos.request.DeleteCompletedTaskRequest;
import com.anything.dtos.request.NewTaskRequest;
import com.anything.dtos.request.TaskStatusRequest;
import com.anything.dtos.response.DeleteCompletedTaskResponse;
import com.anything.dtos.response.NewTaskResponse;
import com.anything.dtos.response.TaskStatusResponse;
import com.anything.service.interfacePack.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import static com.anything.utils.Mapper.*;

@Service
@RequiredArgsConstructor
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;

    @Override
    public NewTaskResponse addNewTask(NewTaskRequest newTaskRequest) {
        Task newTask = taskMapper(newTaskRequest.getMessage(),newTaskRequest.getDate());
        taskRepository.save(newTask);
        return newTaskResponse("Task added successfully");
    }

    @Override
    public TaskStatusResponse showTaskStatus(TaskStatusRequest taskStatusRequest) {
        Task taskResponse = taskMapper(taskStatusRequest.getMessage(),taskStatusRequest.getDate());
        taskRepository.save(taskResponse);
        return taskStatusResponse("Completion Status loading...");
    }

    @Override
    public DeleteCompletedTaskResponse deleteTask(DeleteCompletedTaskRequest deleteCompletedTaskRequest) {
        return null;
    }


}
