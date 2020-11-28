package com.stepan.web.web.v1.controller;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.service.ListOfTaskService;
import com.stepan.web.web.dto.ListOfTaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stepan.web.web.v1.ApiConstantUtils.LISTS;

@RestController
@RequiredArgsConstructor
@RequestMapping(LISTS)
public class ListOfTaskController {

    private final ListOfTaskService listOfTaskService;

    @GetMapping("/getAll")
    public List<ListOfTaskDto> getAllList() {
        return listOfTaskService.getAllList();
    }

    @PostMapping("/update/{id}")
    public void updateList(@PathVariable("id") Long id, @RequestBody ListOfTask listOfTask) {
        listOfTaskService.updateList(id, listOfTask);
    }

    @PostMapping("/add")
    public void addNewList(@RequestBody ListOfTask listOfTask) {
        listOfTaskService.addNewList(listOfTask);
    }

    @PostMapping("/delete/{id}")
    public void deleteList(@PathVariable Long id) {
        listOfTaskService.deleteList(id);
    }
}
