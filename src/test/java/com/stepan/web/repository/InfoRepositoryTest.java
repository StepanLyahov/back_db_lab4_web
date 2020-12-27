package com.stepan.web.repository;

import com.stepan.web.entity.Info;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoRepositoryTest {

    private InfoRepository infoRepository;

    @Test
    @Disabled
    void addInfo() {
        Info info = Info.builder()
                .description("descr")
                .logo(null)
                .number("number")
                .build();

        infoRepository.save(info);
    }
}