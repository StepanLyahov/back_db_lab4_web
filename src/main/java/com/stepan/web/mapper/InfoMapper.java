package com.stepan.web.mapper;

import com.stepan.web.entity.Info;
import com.stepan.web.web.v1.dto.InfoDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface InfoMapper {
    @Mapping(target = "logo", ignore = true)
    InfoDto toDto(Info info);

    Info toEntity(InfoDto dto);
}
