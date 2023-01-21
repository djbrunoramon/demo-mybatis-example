package com.example.demomybatisexample.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demomybatisexample.beans.Article;
import com.example.demomybatisexample.mapper.ArticleMapper;

import java.util.List;

@Repository
public class ArticleRepository {

    @Autowired
    private ArticleMapper articleMapper;

    public Article getArticleById(Long id) {
        return articleMapper.getArticle(id);
    }

    public List<Article> findAll() {
        return articleMapper.findAll();
    }
}
