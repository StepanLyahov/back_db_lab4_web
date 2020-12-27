package com.stepan.web.mapper;

import com.stepan.web.entity.News;
import com.stepan.web.web.v1.dto.NewsDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface NewsMapper {

    @Mapping(target = "image", ignore = true)
    NewsDto toDto(News news);

    News toEntity(NewsDto dto);
}
