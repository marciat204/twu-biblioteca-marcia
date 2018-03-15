package com.twu.message;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserMessagesTest {

    @Test
    public void ShouldDisplayWelcomeMessage(){
        String welcomeMessage = UserMessages.getWelcomeMessage();
        assertEquals("Welcome to the Biblioteca :D", welcomeMessage);
    }

    @Test
    public void ShouldDisplayCheckoutSuccessfulMessage() {
        String expectedMessage = "Thank you! Enjoy the book";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getCheckoutSuccessfulMessage("book");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayCheckoutUnsuccessfulMessage() {
        String expectedMessage = "That book is not available";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getCheckoutUnsuccessfulMessage("book");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayReturnSuccessfulMessage() {
        String expectedMessage = "Thank you for returning the book";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getReturnSuccessfulMessage("book");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayReturnUnsuccessfulMessage() {
        String expectedMessage = "That is not a valid book to return.";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getReturnUnsuccessfulMessage("book");

        assertEquals(expectedMessage, actualMessage);
    }

}