package com.stepan.web.service.impl;

import com.stepan.web.repository.NewsRepository;
import com.stepan.web.service.NewsService;
import com.stepan.web.web.v1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsRepository newsRepository;

    @Override
    public List<NewsDto> getAllNews() {
        return null;
    }

    @Override
    public NewsDto getNewsById(Long id) {
        return null;
    }
}
