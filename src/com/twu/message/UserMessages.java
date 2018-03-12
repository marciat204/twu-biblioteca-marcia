package com.twu.message;

public class UserMessages {

    public static String getWelcomeMessage() {
        return "Welcome to the Biblioteca :D";
    }

    public String getCheckoutSuccessfulMessage() {
        return "Thank you! Enjoy the book";
    }

    public String getCheckoutUnsuccessfulMessage() {
        return "That book is not available";
    }

    public String getReturnSuccessfulMessage() {
        return "Thank you for returning the book";
    }

    public String getReturnUnsuccessfulMessage() {
        return "That is not a valid book to return.";
    }
}
