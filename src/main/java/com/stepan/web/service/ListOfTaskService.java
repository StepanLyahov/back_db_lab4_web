package com.stepan.web.service;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.repository.ListOfTaskRepository;
import com.stepan.web.web.dto.ListOfTaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ListOfTaskService {

    private final ListOfTaskRepository listOfTaskRepository;

    public List<ListOfTaskDto> getAllList() {
        return null;
    }

    public void updateList(Long id, ListOfTask listOfTask) {

    }

    public void addNewList(ListOfTask listOfTask) {

    }

    public void deleteList(Long id) {

    }

}
