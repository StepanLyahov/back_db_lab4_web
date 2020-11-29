package com.stepan.web.web.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ColorDto {
    Long id;
    String hex;
    String name;
}
