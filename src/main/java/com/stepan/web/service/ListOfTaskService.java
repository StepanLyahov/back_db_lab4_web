package com.stepan.web.service;

import com.stepan.web.entity.Color;
import com.stepan.web.entity.ListOfTask;
import com.stepan.web.mapper.ColorMapper;
import com.stepan.web.mapper.ListOfTaskMapper;
import com.stepan.web.mapper.TaskMapper;
import com.stepan.web.repository.ColorRepository;
import com.stepan.web.repository.ListOfTaskRepository;
import com.stepan.web.web.dto.ColorDto;
import com.stepan.web.web.dto.ListOfTaskDto;
import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ListOfTaskService {

    private final ListOfTaskRepository listOfTaskRepository;
    private final ListOfTaskMapper listOfTaskMapper;

    private final ColorRepository colorRepository;
    private final ColorMapper colorMapper;

    private final TaskMapper taskMapper;

    public List<ListOfTaskDto> getAllList() {
        List<ListOfTask> res = listOfTaskRepository.findAll();

        List<ListOfTaskDto> listOfTaskDtos = new LinkedList<>();
        res.forEach(e -> {
            ListOfTaskDto dto = listOfTaskMapper.toDTO(e);

            ColorDto colorDto = colorMapper.toDTO(e.getColorId());
            dto.setColor(colorDto);

            List<TaskDto> taskDtos = e.getTasks()
                    .stream().map(taskMapper::toDTO)
                    .collect(Collectors.toList());

            dto.setTasks(taskDtos);

            listOfTaskDtos.add(dto);

        });

        return listOfTaskDtos;
    }

    @SneakyThrows
    public void updateList(Long id, ListOfTaskDto dto) {
        Optional<ListOfTask> res = listOfTaskRepository.findById(id);
        if (res.isEmpty())
            throw new Exception("ListOfTask does not exist id:" + id);
    }

    public void addNewList(ListOfTaskDto dto) {
        ListOfTask listOfTask = listOfTaskMapper.toEntity(dto);
        Color color = colorRepository.getOne(dto.getColor().getId());
        listOfTask.setColorId(color);

        listOfTaskRepository.save(listOfTask);
    }

    public void deleteList(Long id) {
        listOfTaskRepository.deleteById(id);
    }
}
