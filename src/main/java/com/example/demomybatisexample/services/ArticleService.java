package com.example.demomybatisexample.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demomybatisexample.beans.Article;
import com.example.demomybatisexample.repository.ArticleRepository;

@Service
@Transactional
public class ArticleService {

	@Autowired
	private ArticleRepository articleRepository;
	
	@Transactional(readOnly = true)
	public Article getArticleById(Long id) {
		return articleRepository.getArticleById(id);
	}
}
