package com.twu.biblioteca;

/**
 * Created by jiaoming on 8/5/15.
 */
public class Book {
    private String name;
    private String author;
    private String publishedYear;

    public Book(){

    }

    public Book(String name,String author,String publishedYear) {
        this.name = name;
        this.author=author;
        this.publishedYear=publishedYear;
    }

    public String getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(String publishedYear) {
        this.publishedYear = publishedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }




}
