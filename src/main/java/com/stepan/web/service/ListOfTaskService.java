package com.stepan.web.service;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.mapper.ListOfTaskMapper;
import com.stepan.web.repository.ListOfTaskRepository;
import com.stepan.web.web.dto.ListOfTaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ListOfTaskService {

    private final ListOfTaskRepository listOfTaskRepository;

    private final ListOfTaskMapper listOfTaskMapper;

    public List<ListOfTaskDto> getAllList() {
        return null;
    }

    public void updateList(Long id, ListOfTaskDto dto) {

    }

    public void addNewList(ListOfTaskDto dto) {


    }

    public void deleteList(Long id) {
        listOfTaskRepository.deleteById(id);
    }
}
