package com.stepan.web.repository;

import com.stepan.web.entity.Image;
import com.stepan.web.entity.Info;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;


class InfoRepositoryTest extends BaseTest {

    @Autowired
    private InfoRepository infoRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Test
    void addAllInfoToDB() {

        infoRepository.deleteAll();

        // тебе нужна только одна info
        Info info = Info.builder()
                .description("descr")
                .logo(null)
                .logoFacebook(addImage("","" ,""))
                .number("number")
                .build();

        infoRepository.save(info);

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