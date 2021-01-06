package com.stepan.web.web.v1.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GameDto {

    Long id;

    String nameGame;

    String platform;

    String genre;

    ImageDto cover;

    String dateReleased;
}
