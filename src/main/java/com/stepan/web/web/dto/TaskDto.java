package com.stepan.web.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;


@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskDto {
    Long id;
    String text;
    Boolean completed;
    Long listId;
}
