package com.example.article.web;

import com.example.article.entities.Article;
import com.example.article.repository.ArticleRepository;
import lombok.AllArgsConstructor;
import org.hibernate.query.results.ResultsHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
@AllArgsConstructor
public class ArticleController {

    private ArticleRepository articleRepository;
@GetMapping(path = "/newArticle")
    public  String newArticle(){

        return "newArticle";
    }

    @GetMapping(path = "/index")
    public  String index(Model model){
        List<Article> articles = articleRepository.findAll();
        model.addAttribute("listeArticles", articles);
        return "index";
    }

    @GetMapping(path = "/test2")
    public  String test2(){

        return "test2";
    }

    @GetMapping(path = "/test3")
    public  String test3(){

        return "test3";
    }

    @GetMapping(path = "/test4")
    public  String test4(){

        return "test4";
    }

    @GetMapping(path = "/login")
    public  String login(){

        return "login";
    }

    @GetMapping(path = "/articles")
    public  String articles(Model model){
        List<Article> articles = articleRepository.findAll();
        model.addAttribute("listeArticles", articles);
        return "articles";
    }



}
