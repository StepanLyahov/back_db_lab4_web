package com.stepan.web.web.v1.controller;

import com.stepan.web.service.NewsService;
import com.stepan.web.web.v1.dto.NewsDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.stepan.web.web.v1.ApiUtil.NEWS;

@RestController
@RequestMapping(NEWS)
@CrossOrigin
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    @GetMapping("/getAllNews")
    public List<NewsDto> getAllNews() {
        return newsService.getAllNews();
    }

    @GetMapping("/getNews/{id}")
    public NewsDto getNewsById(@PathVariable("id") Long id) {
        return newsService.getNewsById(id);
    }
}
