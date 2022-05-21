package com.example.demomybatisexample.mapper;

import com.example.demomybatisexample.beans.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ArticleMapper {
    Article getArticle(@Param("id") Long id);
}
