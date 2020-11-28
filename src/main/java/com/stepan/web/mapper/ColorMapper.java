package com.stepan.web.mapper;

import com.stepan.web.entity.Color;
import com.stepan.web.web.dto.ColorDto;
import org.mapstruct.Mapper;


@Mapper
public interface ColorMapper {

    ColorDto toDTO(Color entity);

    Color toEntity(ColorDto dto);
}
