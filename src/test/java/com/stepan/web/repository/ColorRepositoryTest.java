package com.stepan.web.repository;

import com.stepan.web.BaseTest;
import com.stepan.web.entity.Color;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ColorRepositoryTest extends BaseTest {

    @Autowired
    ColorRepository colorRepository;

    @Test
    public void testCRUD() {
        Color color = Color.builder()
                .hex("hex")
                .name("red")
                .build();

        colorRepository.save(color);
    }

}