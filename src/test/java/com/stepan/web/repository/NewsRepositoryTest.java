package com.stepan.web.repository;

import com.stepan.web.entity.Image;
import com.stepan.web.entity.News;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NewsRepositoryTest extends BaseTest {

    @Autowired
    private NewsRepository newsRepository;


    @Test
    @Disabled
    void addNews() { // запустить это чтобы добавить данные
        News news = News.builder()
                .description("My descr")
                .lessDescription("less descr")
                .title("My title")
                .image(null)
                .build();

        newsRepository.save(news);
    }


    @Test
    @Disabled
    void testAddAndReadNewsFromDB() {
        newsRepository.deleteAll();

        Image imageCat = getImage("Yor path to image in resources");

        News news = News.builder()
                .description("My descr")
                .lessDescription("less descr")
                .title("My title")
                .image(imageCat)
                .build();

        newsRepository.save(news);

        List<News> res = newsRepository.findAll();
        assertEquals("My descr", res.get(0).getDescription());
    }

    private Image getImage(String path) {
        File file = new File(path);
        byte[] bFile = new byte[(int) file.length()];

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Image image = Image.builder()
                .name("myImage")
                .type("jpg")
                .imageData(bFile)
                .build();

        return image;
    }

}