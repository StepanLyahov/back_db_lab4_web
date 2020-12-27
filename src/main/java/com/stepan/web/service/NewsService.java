package com.stepan.web.service;

import com.stepan.web.web.v1.dto.NewsDto;

import java.util.List;

public interface NewsService {
    List<NewsDto> getAllNews();
    NewsDto getNewsById(Long id);
}
