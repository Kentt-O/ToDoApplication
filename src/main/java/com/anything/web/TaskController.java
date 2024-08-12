package com.anything.web;

import com.anything.dtos.request.NewTaskRequest;
import com.anything.dtos.request.RegisterRequest;
import com.anything.dtos.request.TaskStatusRequest;
import com.anything.dtos.response.NewTaskResponse;
import com.anything.dtos.response.RegisterResponse;
import com.anything.dtos.response.TaskStatusResponse;
import com.anything.service.interfacePack.TaskService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v01")
@RequiredArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @PostMapping("/addNewTask")
    public ResponseEntity<?> addNewTask(@RequestBody NewTaskRequest newTaskRequest){
        try{
            NewTaskResponse newTaskResponse = taskService.addNewTask(newTaskRequest);
            return ResponseEntity.ok().body(newTaskResponse);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }

    @PostMapping("/showTaskStatus")
    public ResponseEntity<?> showTaskStatus(@RequestBody TaskStatusRequest taskStatusRequest){
        try{
            TaskStatusResponse taskStatusResponse = taskService.showTaskStatus(taskStatusRequest);
            return ResponseEntity.ok().body(taskStatusResponse);
        }catch (Exception exception){
            return ResponseEntity.badRequest().body(exception.getMessage());
        }
    }
}
