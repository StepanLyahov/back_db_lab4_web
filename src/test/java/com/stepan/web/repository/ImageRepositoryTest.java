package com.stepan.web.repository;

import com.stepan.web.entity.Image;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileInputStream;

class ImageRepositoryTest extends BaseTest {

    @Autowired
    private ImageRepository imageRepository;

    @Test
    @Disabled
    void saveImage() {
        File file = new File("/Users/stepanlahov/Desktop/work/web_db/src/main/resources/cat1.jpg");
        byte[] bFile = new byte[(int) file.length()];

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            fileInputStream.read(bFile);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Image image = Image.builder()
                .name("myImageCat") // имя картинки
                .type("jpg") // тип
                .imageData(bFile)
                .build();

        imageRepository.save(image);

    }

}
