package com.stepan.web.web.v1.controller;

import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static com.stepan.web.web.v1.ApiConstantUtils.TASK;

@RestController
@RequestMapping(TASK)
@RequiredArgsConstructor
public class TaskController {

    @PostMapping("/update/{id}")
    public void updateTask(@PathVariable("id") Long id, @RequestBody TaskDto taskDto) {

    }

    @PostMapping("/add")
    public void addTask( @RequestBody TaskDto taskDto) {

    }

    @PostMapping("/delete/{id}")
    public void deleteTask(@PathVariable("id") Long id) {

    }

}
