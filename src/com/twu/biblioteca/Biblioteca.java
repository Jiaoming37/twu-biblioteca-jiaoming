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
        this.addBook("javajava","zhao","2011-12-11");
        this.addBook("jenkins","lucy", "2012-12-11");
        this.addBook("intellij","tomi", "2013-12-11");
        this.addBook("mysqlsql","json","2014-12-11");

        this.addOption("List Books");
    }

    private void addBook(String name,String author,String publishedYear) {
        Book book=new Book();
        book.setName(name);
        book.setAuthor(author);
        book.setPublishedYear(publishedYear);
        books.add(book);
    }

    private void addOption(String name){
        Option option=new Option();
        option.setName(name);
        mainMenu.add(option);
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
}
