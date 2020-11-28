package com.stepan.web.service;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.repository.ListOfTaskRepository;
import com.stepan.web.web.dto.ListOfTaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ListOfTaskService {

    private final ListOfTaskRepository listOfTaskRepository;

    public List<ListOfTaskDto> getAllList() {
        return null;
    }

    public void updateList(Long id, ListOfTask listOfTask) {

    }

    public void addNewList(@RequestBody ListOfTask listOfTask) {

    }

    public void deleteList(Long id) {

    }

}
