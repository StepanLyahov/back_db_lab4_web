package com.stepan.web.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ListOfTaskDto {
    Long id;
    ColorDto color;
    String name;
    List<TaskDto> tasks;
}