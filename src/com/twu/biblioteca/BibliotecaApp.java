package com.twu.biblioteca;

import com.twu.message.UserMessages;
import menu.MenuOptions;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(UserMessages.getWelcomeMessage());
        MenuOptions menuOptions = new MenuOptions();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println(menuOptions.getMainMenuList());
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("quit")){
                quit = true;
            }

            System.out.println(menuOptions.chooseOption(input));
        }while (!quit);
    }
}
