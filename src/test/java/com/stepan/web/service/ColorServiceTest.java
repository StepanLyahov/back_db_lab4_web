package com.stepan.web.service;

import com.stepan.web.BaseTest;
import com.stepan.web.entity.Color;
import com.stepan.web.repository.ColorRepository;
import com.stepan.web.web.dto.ColorDto;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.List;

import static org.mockito.Mockito.when;


public class ColorServiceTest extends BaseTest {

    @Autowired
    ColorService colorService;

    @MockBean
    ColorRepository repository;

    private List<Color> getColors() {
        Color color1 = Color.builder()
                .id((long) 1)
                .hex("hex")
                .name("red")
                .listOfTask(null)
                .build();

        Color color2 = Color.builder()
                .id((long) 2)
                .hex("hex2")
                .name("red2")
                .listOfTask(null)
                .build();

        return List.of(color1, color2);
    }

    @Test
    public void getAllTest() {
        when(repository.findAll()).thenReturn(getColors());

        List<ColorDto> res = colorService.getAllColor();

        ColorDto colorDto = ColorDto.builder()
                .id((long) 2)
                .hex("hex2")
                .name("red2")
                .build();

        Assert.assertEquals(res.get(1), colorDto);

    }

}