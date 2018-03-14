package menu;

import com.twu.products.book.BookManager;
import com.twu.message.UserMessages;

public class MenuOptions {
    private BookManager bookManager;
    private UserMessages userMessages;

    public MenuOptions() {
        bookManager = new BookManager();
        userMessages = new UserMessages();
    }

    public String getMainMenuList() {
        String menuOptions = "1. List Books\n" +
                "2. Checkout Book\n"+
                "3. Return Book\n";
        return menuOptions;
    }

    public String chooseOption(String option) {
        String optionReturn = "Invalid Option";
        switch (option.toLowerCase()){
            case "1":
                optionReturn = bookManager.getAllBooksDetailsList();
                break;
            case "2":
                optionReturn = "Insert the book name";
                break;
            case "3":
                optionReturn = "Insert the book name";
                break;
            case "quit":
                optionReturn = "Quit";
                break;
        }
        return optionReturn;
    }

    public String checkoutBook(String bookName) {
        boolean hasSuccess = bookManager.checkout(bookName);
        String message = getCheckoutMessage(hasSuccess);
        return message;
    }

    private String getCheckoutMessage(boolean hasSuccess) {
        String message = "";
        if (hasSuccess){
            message = userMessages.getCheckoutSuccessfulMessage();
        }else {
            message = userMessages.getCheckoutUnsuccessfulMessage();
        }
        return message;
    }

    public String returnBook(String bookName) {
        boolean hasSuccess = bookManager.returnBook(bookName);
        String message = getReturnMessage(hasSuccess);
        return message;
    }

    private String getReturnMessage(boolean hasSuccess) {
        String message = "";
        if (hasSuccess){
            message = userMessages.getReturnSuccessfulMessage();
        }else {
            message = userMessages.getReturnUnsuccessfulMessage();
        }
        return message;
    }
}
