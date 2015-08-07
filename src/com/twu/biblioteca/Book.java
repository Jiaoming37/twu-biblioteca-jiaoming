package com.twu.biblioteca;

/**
 * Created by jiaoming on 8/5/15.
 */
public class Book {
    private String name;
    private String author;
    private String publishedYear;
    private Boolean checkOuted=false;

    public Book(){

    }

    public Book(String name,String author,String publishedYear,Boolean checkOuted) {
        this.name = name;
        this.author=author;
        this.publishedYear=publishedYear;
        this.checkOuted=checkOuted;
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

    public Boolean getCheckOuted() {
        return checkOuted;
    }

    public void setCheckOuted(Boolean checkOuted) {
        this.checkOuted = checkOuted;
    }
}
