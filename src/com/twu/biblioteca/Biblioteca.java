package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaoming on 8/5/15.
 */
public class Biblioteca {
    public  List<Book> books=new ArrayList<Book>();

    public Biblioteca(){
        this.addBook("java", "2011-12-11", "beijing");
        this.addBook("jenkins", "2012-12-11", "beijing");
        this.addBook("intellij", "2013-12-11", "beijing");
        this.addBook("mysql","2014-12-11","beijing");
    }

    private  void addBook(String author,String year,String published) {
        Book book=new Book();
        book.setAuthor(author);
        book.setYear(year);
        book.setPublished(published);
        books.add(book);
    }
}
