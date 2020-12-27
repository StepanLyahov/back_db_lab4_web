package com.stepan.web.web.v1.dto;

import com.stepan.web.entity.Image;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class NewsDto {

    Long id;

    String title;

    String lessDescription;

    String description;

    Image image;
}
