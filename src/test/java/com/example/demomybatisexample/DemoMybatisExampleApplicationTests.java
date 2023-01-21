package com.example.demomybatisexample;

import com.example.demomybatisexample.beans.Article;
import com.example.demomybatisexample.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoMybatisExampleApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
        Long idArticle = 1L;
        Article article = articleMapper.getArticle(idArticle);

        assertThat(article).isNotNull();
        assertThat(article.getId()).isEqualTo(idArticle);
        assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring");
        assertThat(article.getAuthor().getFirstName()).isEqualTo("Bruno");
        assertThat(article.getAuthor().getLastName()).isEqualTo("Ramon");
        assertThat(article.isHasAuthor()).isTrue();
    }

    @Test
    void whenRecordsInDatabase_shouldReturnArticleWithoutAuthor() {
        Long idArticle = 2L;
        Article article = articleMapper.getArticle(idArticle);

        assertThat(article).isNotNull();
        assertThat(article.getId()).isEqualTo(idArticle);
        assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring Vol. 2");
        assertThat(article.getAuthor()).isNull();
        assertThat(article.isHasAuthor()).isFalse();
    }

    @Test
    void whenRecordsInDatabase_shouldReturnAListOfArticle() {
        List<Article> articles = articleMapper.findAll();

        assertThat(articles)
                .hasSize(2)
                .anyMatch(article -> article.getTitle().equals("Working with MyBatis in Spring"))
                .anyMatch(article -> article.getTitle().equals("Working with MyBatis in Spring Vol. 2"));
    }
}
