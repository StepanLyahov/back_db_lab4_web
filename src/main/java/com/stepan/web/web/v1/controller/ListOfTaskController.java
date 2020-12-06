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
@CrossOrigin
public class ListOfTaskController {

    private final ListOfTaskService listOfTaskService;

    @GetMapping("/getAll")
    public List<ListOfTaskDto> getAllList() {
        return listOfTaskService.getAllList();
    }

    @PostMapping("/update/{id}")
    public ListOfTaskDto updateList(@PathVariable("id") Long id, @RequestBody ListOfTaskDto listOfTaskDto) {
        return listOfTaskService.updateList(id, listOfTaskDto);
    }

    @PostMapping("/add")
    public ListOfTaskDto addNewList(@RequestBody ListOfTaskDto listOfTaskDto) {
        return listOfTaskService.addNewList(listOfTaskDto);
    }

    @PostMapping("/delete/{id}")
    public void deleteList(@PathVariable Long id) {
        listOfTaskService.deleteList(id);
    }
}
