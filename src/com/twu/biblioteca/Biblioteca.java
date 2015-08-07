package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaoming on 8/5/15.
 */
public class Biblioteca {
    public List<Book> books=new ArrayList<Book>();
    public List<Option> mainMenu=new ArrayList<Option>();
    public List<Movie> movies=new ArrayList<Movie>();

    public Biblioteca(){
        this.addBook("javajava","zhao","2011-12-11");
        this.addBook("jenkins","lucy", "2012-12-11");
        this.addBook("intellij","tomi", "2013-12-11");
        this.addBook("mysqlsql","json","2014-12-11");

        this.addOption("List Books");
        this.addOption("List Movies");
        this.addOption("Checkout Book");
        this.addOption("Checkout Movie");
        this.addOption("Return Book");
        this.addOption("Quit");

        this.addMovie("martial","2009-12-25","chengLo","10");
        this.addMovie("comedies","2015-2-15","qingYao","2");
        this.addMovie("tragedy","2014-10-05","heJiong","4");
        this.addMovie("thriller","2015-7-25","jieLun","unrated");
    }

    private void addBook(String name,String author,String publishedYear) {
        Book book=new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPublishedYear(publishedYear);
        books.add(book);
    }

    private void addMovie(String name,String year,String director,String rate){
        Movie movie=new Movie();
        movie.setName(name);
        movie.setYear(year);
        movie.setDirector(director);
        movie.setRate(rate);
        movies.add(movie);
    }

    private void addOption(String name){
        Option option=new Option();
        option.setName(name);
        mainMenu.add(option);
    }

    private List<String> getBookNameList(){
        List<String> bookNameList=new ArrayList<String>();
        for(Book book:books){
            String bookName=book.getName();
            bookNameList.add(bookName);
        }
        return bookNameList;
    }

    public int hasBook(String bookName){
        List<String> nameList=getBookNameList();
        int index=nameList.indexOf(bookName);
        return index;
    }

    public Boolean avliableMovie(String movieName){
        Boolean isAvliabled=false;
        for(Movie movie:movies){
            if(movie.getName().equals(movieName)){
                if(!movie.getCheckouted()){
                    isAvliabled=true;
                }
            }
        }
        return isAvliabled;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Option> getMainMenu() {
        return mainMenu;
    }

    public void setMainMenu(List<Option> mainMenu) {
        this.mainMenu = mainMenu;
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
