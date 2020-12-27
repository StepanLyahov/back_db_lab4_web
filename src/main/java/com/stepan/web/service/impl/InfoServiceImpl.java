package com.stepan.web.service.impl;

import com.stepan.web.entity.Info;
import com.stepan.web.mapper.InfoMapper;
import com.stepan.web.repository.InfoRepository;
import com.stepan.web.service.InfoService;
import com.stepan.web.web.v1.dto.InfoDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InfoServiceImpl implements InfoService {

    private final InfoRepository infoRepository;

    private final InfoMapper infoMapper;

    @Override
    public InfoDto getInfo() {
        List<Info> res = infoRepository.findAll();
        if (!res.isEmpty())
            return infoMapper.toDto(res.get(0));
        else
            throw new RuntimeException("Info is not exists");
    }
}
