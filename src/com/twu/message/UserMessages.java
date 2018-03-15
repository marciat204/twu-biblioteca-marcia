package com.twu.message;

public class UserMessages {

    public static String getWelcomeMessage() {
        return "Welcome to the Biblioteca :D";
    }

    public String getCheckoutSuccessfulMessage(String item) {
        return "Thank you! Enjoy the "+ item;
    }

    public String getCheckoutUnsuccessfulMessage(String item) {
        return "That " + item + " is not available";
    }

    public String getReturnSuccessfulMessage(String item) {
        return "Thank you for returning the " + item;
    }

    public String getReturnUnsuccessfulMessage(String item) {
        return "That is not a valid " + item + " to return.";
    }
}
