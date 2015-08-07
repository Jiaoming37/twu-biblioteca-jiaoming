package com.twu.biblioteca;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

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
        assertEquals("List Books",BibliotecaApp.listMainMeun().get(0));
    }

    @Test
    public void should_return_valid_message_if_choose_a_invlid_option(){
        assertEquals("Select a valid option!",BibliotecaApp.chooseOption("wrong option"));
    }
}
