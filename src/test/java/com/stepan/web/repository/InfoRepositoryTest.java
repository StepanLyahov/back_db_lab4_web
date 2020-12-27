package com.stepan.web.repository;

import com.stepan.web.entity.Info;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InfoRepositoryTest {

    private InfoRepository infoRepository;

    @Test
    @Ignore
    void addInfo() {
        Info info = Info.builder()
                .description("descr")
                .logo(null)
                .number("number")
                .build();

        infoRepository.save(info);
    }
}