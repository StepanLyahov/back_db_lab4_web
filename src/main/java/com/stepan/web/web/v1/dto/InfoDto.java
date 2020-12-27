package com.stepan.web.web.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class InfoDto {

    Long id;

    String number;

    ImageDto logo;

    String description;
}
