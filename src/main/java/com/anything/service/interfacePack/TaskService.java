package com.anything.service.interfacePack;

import com.anything.dtos.request.DeleteCompletedTaskRequest;
import com.anything.dtos.request.NewTaskRequest;
import com.anything.dtos.request.TaskStatusRequest;
import com.anything.dtos.response.DeleteCompletedTaskResponse;
import com.anything.dtos.response.NewTaskResponse;
import com.anything.dtos.response.TaskStatusResponse;

public interface TaskService {
    NewTaskResponse addNewTask(NewTaskRequest newTaskRequest);
    TaskStatusResponse showTaskStatus(TaskStatusRequest taskStatusRequest);
    DeleteCompletedTaskResponse deleteTask (DeleteCompletedTaskRequest deleteCompletedTaskRequest);
}
