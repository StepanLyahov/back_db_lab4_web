package com.stepan.web.repository;

import com.stepan.web.entity.News;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsRepositoryTest extends BaseTest {

    @Autowired
    private NewsRepository newsRepository;

    @Test
    void testAddAndReadNewsFromDB() {
        newsRepository.deleteAll();

        News news = News.builder()
                .description("My descr")
                .lessDescription("less descr")
                .title("My title")
                .build();

        newsRepository.save(news);

        List<News> res = newsRepository.findAll();
        assertEquals("My descr", res.get(0).getDescription());
    }

}