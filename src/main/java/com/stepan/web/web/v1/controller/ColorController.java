package com.stepan.web.web.v1.controller;

import com.stepan.web.web.dto.ColorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.stepan.web.web.v1.ApiConstantUtils.COLOR;

@RestController
@RequestMapping(COLOR)
@RequiredArgsConstructor
public class ColorController {

    @GetMapping("/getAll")
    public List<ColorDto> getAllColor() {
        return null;
    }
}
