package com.twu.biblioteca;

import com.twu.message.UserMessages;
import menu.MenuOptions;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {
        boolean quit = false;
        System.out.println(UserMessages.getWelcomeMessage());
        System.out.println("-------------------------------------------\n");
        MenuOptions menuOptions = new MenuOptions();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println(menuOptions.getMainMenuList());
            String input = scanner.nextLine();

            System.out.println(menuOptions.chooseOption(input)+"\n");

            String bookName = null;
            switch (input.toLowerCase()){
                case "2":
                    bookName = scanner.nextLine();
                    System.out.println(menuOptions.checkoutBook(bookName));
                    break;
                case "3":
                    bookName = scanner.nextLine();
                    System.out.println(menuOptions.returnBook(bookName));
                    break;
                case "quit":
                    quit = true;
                    break;
            }
            System.out.println("-------------------------------------------\n");
        }while (!quit);
    }
}
