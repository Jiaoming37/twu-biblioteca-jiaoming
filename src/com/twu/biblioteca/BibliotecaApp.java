package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private static Biblioteca biblioteca=new Biblioteca();

    public static void main(String[] args) {
        listWelcomeMessage();

        Scanner scanner=new Scanner(System.in);
        listMovies();
        while (true) {
            listMainMeun();

            System.out.println("Please choose the optionName:");
            String optionName = scanner.nextLine().trim();

            if(optionName.equals("Quit")){
                System.out.println("GoodBye!");
                break;
            }
            if(optionName.equals("List Books")){
                listBooks();
                continue;
            }
            if(optionName.equals("Checkout Book")){
                listBooks();
                System.out.println("Please enter bookName wanted to be checkouted");
                Scanner scannerBook=new Scanner(System.in);
                String bookName=scannerBook.nextLine().trim();
                checkOutBook(bookName);
                continue;
            }
            if(optionName.equals("Return Book")){
                System.out.println("Please enter bookName wanted to be returned");
                Scanner scannerBook=new Scanner(System.in);
                String bookName=scannerBook.nextLine().trim();
                returnBook(bookName);
                continue;
            }
            else{
                listValidMessage();
            }
        }
    }

    public static String listWelcomeMessage() {
        String welcomeMessage="Welcome to Biblioteca, it is open to you now!";
        System.out.println(welcomeMessage);
        System.out.println();
        return welcomeMessage;
    }

    public static List<Book> listBooks() {
        List<Book> books=biblioteca.getBooks();
        System.out.println("Bibioteca has books now as follows:");
        System.out.println("........................................");
        System.out.println("bookName"+" || "+"bookAuthor"+" || "+"bookPublishedYear");
        System.out.println("........................................");
        for(Book book:books){
            if(!book.getCheckOuted()){
                System.out.println(book.getName()+"      "+book.getAuthor()+"        "+book.getPublishedYear());
            }
        }
        System.out.println("........................................");
        System.out.println();
        return books;
    }

    public static String listValidMessage(){
        String validMessage="Select a valid option!";
        System.out.println(validMessage);
        System.out.println();
        return validMessage;
    }

    public static List<Option> listMainMeun(){
        System.out.println("Bibioteca's mainMenu:");
        List<Option> options=biblioteca.getMainMenu();
        for(Option option:options){
            System.out.println(option.getName());
        }
        System.out.println();
        return options;
    }

    public static String checkOutBook(String bookName) {
        String successfullMessage="Thank you! Enjoy the book";
        String unSuccessfullMessage="That book is not available.";

        int index=biblioteca.hasBook(bookName);
        if(index>=0){
            Book book=biblioteca.getBooks().get(index);
            if(!book.getCheckOuted()){
                book.setCheckOuted(true);
                System.out.println(successfullMessage);
                System.out.println();
                return successfullMessage;
            }else{
                System.out.println(unSuccessfullMessage);
                System.out.println();
                return unSuccessfullMessage;
            }
        }else{
            System.out.println(unSuccessfullMessage);
            System.out.println();
            return unSuccessfullMessage;
        }
    }

    public static String returnBook(String bookName) {
        String successfullMessage="Thank you for returning the book.";
        String unSuccessfullMessage="That is not a valid book to return.";

        int index=biblioteca.hasBook(bookName);
        if(index>=0){
            Book book=biblioteca.getBooks().get(index);
            if(book.getCheckOuted()){
                book.setCheckOuted(false);
                System.out.println(successfullMessage);
                System.out.println();
                return successfullMessage;
            }else{
                System.out.println(unSuccessfullMessage);
                System.out.println();
                return unSuccessfullMessage;
            }
        }else{
            System.out.println(unSuccessfullMessage);
            System.out.println();
            return unSuccessfullMessage;
        }
    }

    public static List<Movie> listMovies() {
        List<Movie> movies=biblioteca.getMovies();
        System.out.println("Bibioteca has movies now as follows:");
        System.out.println("........................................");
        System.out.println("movieName"+" || "+"movieYear"+" || "+"movieDirecor"+" ||  "+"movieRate");
        System.out.println("........................................");
        for(Movie movie:movies){
            System.out.println(movie.getName()+"      "+movie.getYear()+"        "+movie.getDirector()+"         "+movie.getRate());

        }
        System.out.println("........................................");
        System.out.println();
        return movies;
    }
}
