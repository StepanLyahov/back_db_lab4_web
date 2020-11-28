package com.stepan.web.service;

import com.stepan.web.repository.ColorRepository;
import com.stepan.web.web.dto.ColorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ColorService {

    private final ColorRepository colorRepository;

    public List<ColorDto> getAllColor() {
        return null;
    }

}
