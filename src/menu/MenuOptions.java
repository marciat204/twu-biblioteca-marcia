package menu;

import com.twu.book.BookManager;
import com.twu.message.UserMessages;

public class MenuOptions {
    private BookManager bookManager;
    private UserMessages userMessages;

    public MenuOptions() {
        bookManager = new BookManager();
        userMessages = new UserMessages();
    }

    public String getMainMenuList() {
        return "1. List Books";
    }

    public String chooseOption(String option) {
        String optionReturn = "Invalid Option";
        if (option.equals(Integer.toString(1))) {
            optionReturn = bookManager.getAllBooksDetailsList();
        }else if (option.equals("Quit")){
            optionReturn = "Quit";
        }
        return optionReturn;
    }

    public String checkoutBook(String bookName) {
        boolean hasSuccess = bookManager.checkout(bookName);
        String message = "";
        if (hasSuccess){
            message = userMessages.getCheckoutSuccessfulMessage();
        }
        return message;
    }
}
