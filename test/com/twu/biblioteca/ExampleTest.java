package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ExampleTest {

    @Test
    public void should_return_welcome_words() {
        assertEquals("Welcome to Biblioteca, it is open to you now!",BibliotecaApp.welcome());
    }

    @Test
    public void should_have_some_books(){
        assertNotNull(BibliotecaApp.listBooks());
    }
}
