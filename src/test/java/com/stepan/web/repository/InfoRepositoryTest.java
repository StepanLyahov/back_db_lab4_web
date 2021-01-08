package com.stepan.web.repository;

import com.stepan.web.entity.Image;
import com.stepan.web.entity.Info;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.transaction.Transactional;
import java.io.File;
import java.io.FileInputStream;


class InfoRepositoryTest extends BaseTest {

    @Autowired
    private InfoRepository infoRepository;

    @Autowired
    private ImageRepository imageRepository;

    @Test
    @Transactional
    void addAllInfoToDB() {
        infoRepository.deleteAll();

        Info info = Info.builder()
                .number("8 (000) 000-00-00")
                .number2("8 (000) 000-00-00")
                .logo(addImage("src/main/resources/info/snail.png","logo" ,"png"))
                .headerImg(addImage("src/main/resources/info/back.jpg","headerImg" ,"jpg"))
                .logoVk(addImage("src/main/resources/info/vk.png", "logoVk", "png"))
                .logoInstagram(addImage("src/main/resources/info/inst.png", "logoInstagram", "png"))
                .logoTwitter(addImage("src/main/resources/info/twit.png", "logoTwitter", "png"))
                .logoFacebook(addImage("src/main/resources/info/faceb1.png", "logoFacebook", "png"))
                .logoTelegram(addImage("src/main/resources/info/teleg.png", "logoTelegram", "png"))
                .urlVk("https://vk.com/gamelnews")
                .urlInstagram("https://www.instagram.com/blog_games/")
                .urlTwitter("https://twitter.com/games_news_")
                .urlFacebook("https://ru-ru.facebook.com/FacebookGaming")
                .urlTelegram("https://tlgrm.ru/channels/gaming")
                .description("SNAIL — молодой сайт относительно своих конкурентов с запоминающимся названием будет информировать всех желающих о новинках в гейм-мире. Также за новостями можно наблюдать и в популярных соцсетях. Прямо сейчас вы зашли на нашу хаб-локацию: SNAIL.Ru — платформа для нашего и вашего контента! Со своей стороны мы можем предложить:\n" +
                        "Читать здесь статьи.\n" +
                        "Общаться в комментариях (в том числе с нами).\n" +
                        "Создавать блоги и участвовать в еженедельном розыгрыше.\n" +
                        "Подписываться на игры и разделы блогов, чтобы собрать из сайта собственную ленту предпочтительного контента.\n" +
                        "Мы тут недавно сделали редизайн, поэтому сайт в активной разработке. Если у вас есть идеи, предложения или вы нашли ужасающий баг — шлите это нам!")
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