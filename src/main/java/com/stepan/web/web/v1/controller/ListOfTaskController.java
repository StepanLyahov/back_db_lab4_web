package com.stepan.web.web.v1.controller;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.web.dto.ListOfTaskDto;
import com.stepan.web.web.dto.TaskDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stepan.web.web.v1.ApiConstantUtils.LISTS;

@RestController
@RequiredArgsConstructor
@RequestMapping(LISTS)
public class ListOfTaskController {

    @GetMapping("/getAll")
    public List<ListOfTaskDto> getAllList() {
        return null;
    }

    @PostMapping("/update/{id}")
    public void updateList(@PathVariable("id") Long id, @RequestBody ListOfTask listOfTask) {

    }

    @PostMapping("/add")
    public void addNewList(@RequestBody ListOfTask listOfTask) {

    }

    @PostMapping("/delete/{id}")
    public void deleteList(@PathVariable Long id) {

    }
}
