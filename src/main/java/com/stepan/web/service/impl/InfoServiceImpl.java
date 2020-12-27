package com.stepan.web.service.impl;

import com.stepan.web.entity.Info;
import com.stepan.web.entity.News;
import com.stepan.web.mapper.InfoMapper;
import com.stepan.web.repository.InfoRepository;
import com.stepan.web.service.ImageService;
import com.stepan.web.service.InfoService;
import com.stepan.web.web.v1.dto.InfoDto;
import com.stepan.web.web.v1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;

    private final ImageService imageService;

    private final InfoMapper infoMapper;

    @Override
    public InfoDto getInfo() {
        List<Info> res = infoRepository.findAll();
        if (!res.isEmpty()) {

            Info info = res.get(0);
            InfoDto resDto = infoMapper.toDto(info);
            resDto.setLogo(imageService.toDto(info.getLogo()));


            return resDto;

        } else
            throw new RuntimeException("Info is not exists");
    }
}
