package com.example.demomybatisexample;

import com.example.demomybatisexample.beans.Article;
import com.example.demomybatisexample.mapper.ArticleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoMybatisExampleApplicationTests {

    @Autowired
    private ArticleMapper articleMapper;

    @Test
    void whenRecordsInDatabase_shouldReturnArticleWithGivenId() {
        Article article = articleMapper.getArticle(1L);

        assertThat(article).isNotNull();
        assertThat(article.getId()).isEqualTo(1L);
        assertThat(article.getAuthor()).isEqualTo("Bruno Ramon");
        assertThat(article.getTitle()).isEqualTo("Working with MyBatis in Spring");
    }

}
