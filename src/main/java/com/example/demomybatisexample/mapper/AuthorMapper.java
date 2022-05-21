package com.example.demomybatisexample.mapper;

import com.example.demomybatisexample.beans.Author;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface AuthorMapper {

    Author getAuthor(@Param("id") Long id);
}
