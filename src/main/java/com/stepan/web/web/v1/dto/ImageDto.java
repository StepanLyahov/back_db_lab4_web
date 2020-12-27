package com.stepan.web.web.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ImageDto {
    Long id;

    String name;

    String type;

    String imageBase64;
}
