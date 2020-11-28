package com.stepan.web.service;

import com.stepan.web.mapper.ColorMapper;
import com.stepan.web.repository.ColorRepository;
import com.stepan.web.web.dto.ColorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository colorRepository;

    private final ColorMapper colorMapper;

    public List<ColorDto> getAllColor() {
        return colorRepository.findAll()
                .stream().map(colorMapper::toDTO)
                .collect(Collectors.toList());
    }

}
