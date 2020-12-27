package com.stepan.web.web.v1.dto;

import com.stepan.web.entity.Image;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoDto {

    Long id;

    String number;

    Image logo;

    String description;
}
