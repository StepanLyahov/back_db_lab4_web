package com.stepan.web.service.impl;

import com.stepan.web.entity.News;
import com.stepan.web.mapper.NewsMapper;
import com.stepan.web.repository.NewsRepository;
import com.stepan.web.service.ImageService;
import com.stepan.web.service.NewsService;
import com.stepan.web.web.v1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    private final ImageService imageService;

    private final NewsMapper newsMapper;

    @Override
    public List<NewsDto> getAllNews() {
        return newsRepository.findAll()
                .stream().map(news -> {
                    NewsDto res = newsMapper.toDto(news);
                    res.setImage(imageService.toDto(news.getImage()));
                    return res;
                })
                .collect(Collectors.toList());
    }

    @Override
    public NewsDto getNewsById(Long id) {
        News res = newsRepository.getOne(id);

        NewsDto resDto = newsMapper.toDto(res);
        resDto.setImage(imageService.toDto(res.getImage()));

        return resDto;
    }
}
