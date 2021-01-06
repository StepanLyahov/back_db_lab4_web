package com.stepan.web.mapper;

import com.stepan.web.entity.News;
import com.stepan.web.web.v1.dto.NewsDto;
import org.mapstruct.Mapper;

@Mapper(uses = {ImageMapper.class, GameMapper.class})
public interface NewsMapper {

    NewsDto toDto(News news);

    News toEntity(NewsDto dto);
}
