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
    public void ShouldDisplayCheckoutSucessfulMessage() {
        String expectedMessage = "Thank you! Enjoy the book";

        UserMessages userMessages = new UserMessages();
        String actualMessage =  userMessages.getCheckoutSuccessfulMessage();

        assertEquals(expectedMessage, actualMessage);
    }
}