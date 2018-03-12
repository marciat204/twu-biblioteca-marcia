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
        String actualMessage =  userMessages.getCheckoutSuccessfulMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayCheckoutUnsuccessfulMessage() {
        String expectedMessage = "That book is not available";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getCheckoutUnsuccessfulMessage();

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayReturnSuccessfulMessage() {
        String expectedMessage = "Thank you for returning the book";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getReturnSuccessfulMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}