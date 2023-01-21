package com.example.article.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.article.entities.Article;

public interface ArticleRepository extends JpaRepository<Article, Long> {

}
