package com.twu.message;

import org.junit.Test;

import static org.junit.Assert.*;

public class UserMessagesTest {

    @Test
    public void ShouldDisplayWelcomeMessage(){
        String welcomeMessage = UserMessages.getWelcomeMessage();
        assertEquals("Welcome to the Biblioteca :D", welcomeMessage);
    }
}