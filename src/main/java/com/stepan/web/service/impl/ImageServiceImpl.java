package com.stepan.web.service.impl;

import com.stepan.web.entity.Image;
import com.stepan.web.service.ImageService;
import com.stepan.web.web.v1.dto.ImageDto;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class ImageServiceImpl implements ImageService {
    @Override
    public ImageDto toDto(Image image) {
        if (image != null) {
            return ImageDto.builder()
                    .id(image.getId())
                    .name(image.getName())
                    .type(image.getType())
                    .imageBase64(Base64.getEncoder().encodeToString(image.getImageData()))
                    .build();
        } else
            return null;


    }
}
