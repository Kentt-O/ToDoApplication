package com.anything.service.interfacePack;

import com.anything.data.model.Date;
import com.anything.dtos.request.NewTaskRequest;
import com.anything.dtos.request.RegisterRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class TaskServiceTest {
    @Autowired
    private TaskService taskService;

    public NewTaskRequest newTaskRequest(String message, Date date){
        NewTaskRequest newRequest = new NewTaskRequest();
        newRequest.setMessage("Task One");
        return newRequest;
    }

}