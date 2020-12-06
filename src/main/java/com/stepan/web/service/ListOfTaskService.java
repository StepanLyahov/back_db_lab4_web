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
        res.forEach(e ->  listOfTaskDtos.add(convertEntityToDto(e)));

        return listOfTaskDtos;
    }

    @SneakyThrows
    public void updateList(Long id, ListOfTaskDto dto) {
        Optional<ListOfTask> res = listOfTaskRepository.findById(id);
        if (res.isEmpty())
            throw new Exception("ListOfTask does not exist id:" + id);

        ListOfTask listOfTask = listOfTaskMapper.toEntity(dto);
        listOfTask.setColorId(res.get().getColorId());

        listOfTaskRepository.save(listOfTask);
    }

    public ListOfTaskDto addNewList(ListOfTaskDto dto) {
        ListOfTask listOfTask = listOfTaskMapper.toEntity(dto);
        Color color = colorRepository.getOne(dto.getColorId());
        listOfTask.setColorId(color);

        ListOfTask res = listOfTaskRepository.save(listOfTask);

        return convertEntityToDto(res);
    }

    public void deleteList(Long id) {
        listOfTaskRepository.deleteById(id);
    }

    private ListOfTaskDto convertEntityToDto(ListOfTask entity) {
        ListOfTaskDto dto = listOfTaskMapper.toDTO(entity);


        if (entity.getColorId() != null) {
            ColorDto colorDto = colorMapper.toDTO(entity.getColorId());
            dto.setColor(colorDto);
        }

        if (entity.getTasks() != null) {
            List<TaskDto> taskDtos = entity.getTasks()
                    .stream().map(taskMapper::toDTO)
                    .collect(Collectors.toList());

            dto.setTasks(taskDtos);
        }

        return dto;
    }

}
