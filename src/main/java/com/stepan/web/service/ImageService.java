package com.stepan.web.service;

import com.stepan.web.entity.Image;
import com.stepan.web.web.v1.dto.ImageDto;

public interface ImageService {
    ImageDto toDto(Image image);
}
