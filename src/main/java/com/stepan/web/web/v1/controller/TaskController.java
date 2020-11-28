package com.stepan.web.web.v1.controller;

import com.stepan.web.service.TaskService;
import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.stepan.web.web.v1.ApiConstantUtils.TASK;

@RestController
@RequestMapping(TASK)
@RequiredArgsConstructor
public class TaskController {

    private final TaskService taskService;

    @PostMapping("/update/{id}")
    public void updateTask(@PathVariable("id") Long id, @RequestBody TaskDto taskDto) {
        taskService.updateTask(id, taskDto);
    }

    @PostMapping("/add")
    public void addTask(@RequestBody TaskDto taskDto) {
        taskService.addTask(taskDto);
    }

    @PostMapping("/delete/{id}")
    public void deleteTask(@PathVariable("id") Long id) {
        taskService.deleteTask(id);
    }
}
