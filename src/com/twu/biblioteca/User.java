package com.twu.biblioteca;

import javax.jws.soap.SOAPBinding;

/**
 * Created by jiaoming on 8/7/15.
 */
public class User {
    private String libraryNumber;
    private String password;

    public User(){}

    public User(String libraryNumber,String password){
        this.libraryNumber=libraryNumber;
        this.password=password;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
