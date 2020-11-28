package com.stepan.web.service;

import com.stepan.web.repository.TaskRepository;
import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskService {

    private final TaskRepository taskRepository;

    public void updateTask(Long id, TaskDto taskDto) {

    }

    public void addTask(TaskDto taskDto) {

    }

    public void deleteTask(Long id) {

    }
}
