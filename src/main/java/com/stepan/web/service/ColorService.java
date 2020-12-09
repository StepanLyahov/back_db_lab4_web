package com.stepan.web.service;

import com.stepan.web.entity.Color;
import com.stepan.web.mapper.ColorMapper;
import com.stepan.web.repository.ColorRepository;
import com.stepan.web.web.dto.ColorDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class ColorService {

    private final ColorRepository colorRepository;

    private final ColorMapper colorMapper;

    @PostConstruct
    void init() {
        colorRepository.deleteAll();

        List<Color> allList = new ArrayList<>();

        Color color1 = Color.builder()
                .name("grey")
                .hex("#C9D1D3")
                .build();

        Color color2 = Color.builder()
                .name("green")
                .hex("#42B883")
                .build();

        Color color3 = Color.builder()
                .name("blue")
                .hex("#64C4ED")
                .build();

        Color color4 = Color.builder()
                .name("pink")
                .hex("#FFBBCC")
                .build();

        Color color5 = Color.builder()
                .name("lime")
                .hex("#B6E6BD")
                .build();

        Color color6 = Color.builder()
                .name("purple")
                .hex("#C355F5")
                .build();

        Color color7 = Color.builder()
                .name("black")
                .hex("#110133")
                .build();

        Color color8 = Color.builder()
                .name("red")
                .hex("#FF6464")
                .build();


        allList.add(color1);
        allList.add(color2);
        allList.add(color3);
        allList.add(color4);
        allList.add(color5);
        allList.add(color6);
        allList.add(color7);
        allList.add(color8);

        colorRepository.saveAll(allList);
    }

    public List<ColorDto> getAllColor() {
        return colorRepository.findAll()
                .stream().map(colorMapper::toDTO)
                .collect(Collectors.toList());
    }

}
