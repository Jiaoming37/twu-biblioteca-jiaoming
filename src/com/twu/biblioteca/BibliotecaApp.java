package com.twu.biblioteca;

import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println(welcome());
        List<Book> books=listBooks();
        for(Book book:books){
            System.out.println(book.getAuthor()+","+book.getYear()+","+book.getPublished());
        }
    }

    public static String welcome() {
        return "Welcome to Biblioteca, it is open to you now!";
    }

    public static List<Book> listBooks() {
        Biblioteca biblioteca=new Biblioteca();
        List<Book> books=biblioteca.books;
        return books;
    }

}
