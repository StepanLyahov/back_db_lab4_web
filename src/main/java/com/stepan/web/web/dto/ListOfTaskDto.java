package com.stepan.web.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ListOfTaskDto {
    Long id;
    ColorDto color;
    Long colorId;
    String name;
    List<TaskDto> tasks;
}
