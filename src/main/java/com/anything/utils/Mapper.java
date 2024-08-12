package com.anything.utils;

import com.anything.data.model.Task;
import com.anything.data.model.User;
import com.anything.dtos.response.DeleteCompletedTaskResponse;
import com.anything.dtos.response.NewTaskResponse;
import com.anything.dtos.response.RegisterResponse;
import com.anything.data.model.Date;
import com.anything.dtos.response.TaskStatusResponse;


public class Mapper {
    public static User userMapper(String name, String password){
        User user = new User();
        user.setUsername(name);
        user.setPassword(password);
        return user;
    }

    public static RegisterResponse registerResponse(String message) {
        RegisterResponse response = new RegisterResponse();
        response.setMessage(message);
        return response;
    }

    public static Task taskMapper(String message, Date date){
        Date dateAdded = new Date();
        dateAdded.setDay(date.getDay());
        dateAdded.setMonth(date.getMonth());
        dateAdded.setYear(date.getYear());

        Task taskToDo = new Task();
        taskToDo.setMessage(message);
        taskToDo.setDateDue(dateAdded);

        return taskToDo;
    }

    public static NewTaskResponse newTaskResponse(String message){
        NewTaskResponse responseToTask = new NewTaskResponse();
        responseToTask.setMessage(message);
        return responseToTask;
    }

    public static TaskStatusResponse taskStatusResponse(String message){
        TaskStatusResponse statusResponseOfTask = new TaskStatusResponse();
        statusResponseOfTask.setMessage(message);
        return statusResponseOfTask;
    }

    public static DeleteCompletedTaskResponse deleteCompletedTaskRequest(String message){
        DeleteCompletedTaskResponse whenTaskIsCompleted = new DeleteCompletedTaskResponse();
        whenTaskIsCompleted.setMessage(message);
        return whenTaskIsCompleted;
    }
}
