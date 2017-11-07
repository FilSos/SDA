package com.sda.springjavapoz4.controller;

import com.sda.springjavapoz4.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("news")
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping
    public ModelAndView getAllNews(){

        ModelAndView news = new ModelAndView("allNews");
        news.addObject("allNews", newsService.getAllService());
        return news;
    }
    //w mappingu i przy pathvariable musi byc ta sama nazwa
    @GetMapping("{id}")
    public ModelAndView getNews(@PathVariable("id") int id){
        ModelAndView news = new ModelAndView("News");
        news.addObject("news",newsService.getNews(id));
        return news;

    }
}