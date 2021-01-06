package com.stepan.web.mapper;

import com.stepan.web.entity.Image;
import com.stepan.web.web.v1.dto.ImageDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.util.Base64;

@Mapper
public interface ImageMapper {

    @Mapping(target="imageBase64", source="image", qualifiedByName = "toBase64")
    ImageDto toDto(Image image);

    @Named("toBase64")
    default String toBase64Image(Image image) {
        return Base64.getEncoder().encodeToString(image.getImageData());
    }

}
