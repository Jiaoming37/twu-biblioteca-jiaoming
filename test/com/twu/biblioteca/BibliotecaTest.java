package com.twu.biblioteca;


import org.junit.Test;

import static org.junit.Assert.*;

public class BibliotecaTest {

    @Test
    public void should_return_welcome_words() {
        assertEquals("Welcome to Biblioteca, it is open to you now!",BibliotecaApp.listWelcomeMessage());
    }

    @Test
    public void should_have_some_books(){
        assertNotNull(BibliotecaApp.listBooks());
    }

    @Test
    public void should_return_first_option_from_main_menu(){
        assertEquals("List Books",BibliotecaApp.listMainMeun().get(0).getName());
    }

    @Test
    public void should_return_valid_message_if_choose_a_invlid_option(){
        assertEquals("Select a valid option!",BibliotecaApp.listValidMessage());
    }

    @Test
    public void test_the_check_out_book_option(){
        Book book=BibliotecaApp.listBooks().get(0);
        assertEquals("Thank you! Enjoy the book",BibliotecaApp.checkOutBook(book.getName()));
        assertTrue(book.getCheckOuted());
        assertEquals("That book is not available.",BibliotecaApp.checkOutBook("wrong name"));
    }

    @Test
    public void test_the_return_book_option(){
        Book book=BibliotecaApp.listBooks().get(0);
        book.setCheckOuted(true);
        assertEquals("Thank you for returning the book.", BibliotecaApp.returnBook(book.getName()));
        assertEquals("That is not a valid book to return.",BibliotecaApp.returnBook("wrong name"));
    }

    @Test
    public void should_have_some_movie(){
        assertNotNull(BibliotecaApp.listMovies());
    }

    @Test
    public void test_the_check_out_movie_option(){
        Movie movie=BibliotecaApp.listMovies().get(0);
        assertEquals("Thank you! Enjoy the movie",BibliotecaApp.checkOutMovie(movie.getName()));
        assertTrue(movie.getCheckouted());
        assertEquals("That movie is not available.",BibliotecaApp.checkOutMovie("wrong name"));
    }

    @Test
    public void test_the_return_movie_option(){
        Movie movie=BibliotecaApp.listMovies().get(0);
        if(!movie.getCheckouted()){
            movie.setCheckouted(true);
        }
        assertEquals("Thank you for returning the movie.", BibliotecaApp.returnMovie(movie.getName()));
        assertEquals("That is not a valid movie to return.",BibliotecaApp.returnMovie("wrong name"));
    }
}
