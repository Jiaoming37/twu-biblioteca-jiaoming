package com.twu.biblioteca;

import java.util.List;
import java.util.Scanner;

public class BibliotecaApp {
    private static Biblioteca biblioteca=new Biblioteca();

    public static void main(String[] args) {
        listWelcomeMessage();

        Scanner scanner=new Scanner(System.in);
        while (true) {
            listMainMeun();
            System.out.println("Please choose the optionName:");
            String optionName = scanner.nextLine().trim();
            if(optionName.equals("Quit")){
                System.out.println("GoodBye!");
                break;
            }if(optionName.equals("Checkout Book")){
                listBooks();
                System.out.println("Please enter bookName wanted to be checkouted");
                String bookName=scanner.nextLine().trim();
                checkOutBook(bookName);
            }
            else{
                chooseOption(optionName);
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
            System.out.println(book.getName()+"      "+book.getAuthor()+"      "+book.getPublishedYear());
        }
        System.out.println("........................................");
        System.out.println();
        return books;
    }

    public static void listValidMessage(){
        String validMessage="Select a valid option!";
        System.out.println(validMessage);
        System.out.println();
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

    public static String chooseOption(String optionName){
        if(optionName.equals("List Books")){
            listBooks();
            return "enjoy";
        }
        if(optionName.equals("Checkout Book")){
            listBooks();
            return "enjoy";
        }
        else{
            listValidMessage();
            return "Select a valid option!";
        }
    }

    public static String checkOutBook(String bookName) {
        int index=biblioteca.hasBook(bookName);
        if(index>=0){
            biblioteca.getBooks().remove(index);
            String successfullMessage="Thank you! Enjoy the book";
            System.out.println(successfullMessage);
            System.out.println();
            return successfullMessage;
        }else{
            String unSuccessfullMessage="That book is not available.";
            System.out.println(unSuccessfullMessage);
            System.out.println();
            return unSuccessfullMessage;
        }
    }
}
