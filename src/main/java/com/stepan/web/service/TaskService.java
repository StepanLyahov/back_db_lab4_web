package com.stepan.web.service;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.entity.Task;
import com.stepan.web.mapper.TaskMapper;
import com.stepan.web.repository.ListOfTaskRepository;
import com.stepan.web.repository.TaskRepository;
import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class TaskService {

    private final TaskMapper mapper;
    private final TaskRepository taskRepository;
    private final ListOfTaskRepository listOfTaskRepository;

    @SneakyThrows
    public void updateTask(Long id, TaskDto taskDto) {
        Optional<Task> task = taskRepository.findById(id);
        if (task.isEmpty())
            throw new Exception("Task does not exist id: " + id);


        Task taskMap = mapper.toEntity(taskDto);
        taskMap.setListId(task.get().getListId());

        taskRepository.save(taskMap);
    }

    public void addTask(TaskDto taskDto) {
        Task task = mapper.toEntity(taskDto);
        ListOfTask listOfTask = listOfTaskRepository.getOne(taskDto.getId());
        task.setListId(listOfTask);

        taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }
}
