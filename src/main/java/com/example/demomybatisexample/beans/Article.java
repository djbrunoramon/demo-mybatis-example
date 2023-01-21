package com.example.demomybatisexample.beans;

public class Article {

    private Long id;
    private String title;
    private Author author;
    private boolean hasAuthor;

    public boolean isHasAuthor() {
        return hasAuthor;
    }

    public void setHasAuthor(boolean hasAuthor) {
        this.hasAuthor = hasAuthor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
