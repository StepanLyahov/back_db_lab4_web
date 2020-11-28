package com.stepan.web.mapper;

import com.stepan.web.entity.Task;
import com.stepan.web.web.dto.TaskDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface TaskMapper {

    @Mapping(target = "listId", expression = "java(setListId(entity))")
    TaskDto toDTO(Task entity);

    default Long setListId(Task entity) {
        return entity.getListId().getId();
    }

    @Mapping(target = "listId", ignore = true)
    Task toEntity(TaskDto dto);
}
