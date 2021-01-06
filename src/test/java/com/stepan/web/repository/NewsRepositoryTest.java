package com.stepan.web.repository;

import com.stepan.web.entity.Game;
import com.stepan.web.entity.Image;
import com.stepan.web.entity.News;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;

class NewsRepositoryTest extends BaseTest {

    @Autowired
    private NewsRepository newsRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Test
    void addAllNewsInDB() {
        newsRepository.deleteAll();

        List<News> allNews = new ArrayList<>();

        News news = News.builder()
                .image(addImage("", "", ""))
                .game(
                        Game.builder()
                        .cover(addImage("", "", ""))

                        .build())
                .build();

        News news1 = News.builder()
                .image(addImage("", "", ""))
                .game(
                        Game.builder()
                                .cover(addImage("", "", ""))

                                .build())
                .build();

        allNews.add(news);
        allNews.add(news1);



        newsRepository.saveAll(allNews);
    }

    private Image addImage(String path, String nameImg, String typeImg) {
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
                .name(nameImg) // имя картинки
                .type(typeImg) // тип
                .imageData(bFile)
                .build();

        return imageRepository.save(image);
    }
}