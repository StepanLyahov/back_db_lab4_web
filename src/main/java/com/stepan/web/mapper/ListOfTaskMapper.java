package com.stepan.web.mapper;

import com.stepan.web.entity.ListOfTask;
import com.stepan.web.web.dto.ListOfTaskDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface ListOfTaskMapper {

    @Mapping(target = "colorId", ignore = true)
    @Mapping(target = "color", ignore = true)
    @Mapping(target = "tasks", ignore = true)
    ListOfTaskDto toDTO(ListOfTask entity);


    @Mapping(target = "colorId", ignore = true)
    @Mapping(target = "tasks", ignore = true)
    ListOfTask toEntity(ListOfTaskDto dto);
}
