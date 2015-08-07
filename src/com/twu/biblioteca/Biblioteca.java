package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiaoming on 8/5/15.
 */
public class Biblioteca {
    public List<Book> books=new ArrayList<Book>();
    public List<Option> mainMenu=new ArrayList<Option>();

    public Biblioteca(){
        this.addBook("java","author","2011-12-11");
        this.addBook("jenkins","author", "2012-12-11");
        this.addBook("intellij","author", "2013-12-11");
        this.addBook("mysql","author","2014-12-11");
    }

    private void addBook(String name,String author,String publishedYear) {
        Book book=new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPublishedYear(publishedYear);
        books.add(book);
    }


}
