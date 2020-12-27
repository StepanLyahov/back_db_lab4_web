package com.stepan.web.mapper;

import com.stepan.web.entity.Info;
import com.stepan.web.web.v1.dto.InfoDto;
import org.mapstruct.Mapper;

@Mapper
public interface InfoMapper {
    InfoDto toDto(Info info);

    Info toEntity(InfoDto dto);
}
