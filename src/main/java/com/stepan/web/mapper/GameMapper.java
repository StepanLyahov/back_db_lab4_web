package com.stepan.web.mapper;

import com.stepan.web.entity.Game;
import com.stepan.web.web.v1.dto.GameDto;
import org.mapstruct.Mapper;

@Mapper(uses = ImageMapper.class)
public interface GameMapper {

    GameDto toDto(Game game);

    Game toEntity(GameDto dto);
}
