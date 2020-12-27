package com.stepan.web.web.v1.controller;

import com.stepan.web.service.InfoService;
import com.stepan.web.web.v1.dto.InfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.stepan.web.web.v1.ApiUtil.INFO;

@RestController
@RequestMapping(INFO)
@RequiredArgsConstructor
public class InfoController {

    private final InfoService infoService;

    @GetMapping("/getInfo")
    public InfoDto getInfo() {
        return infoService.getInfo();
    }
}
