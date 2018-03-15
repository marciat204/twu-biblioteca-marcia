package menu;

import com.twu.products.book.BookManager;
import com.twu.message.UserMessages;
import com.twu.products.movie.MovieManager;

public class MenuOptions {
    private BookManager bookManager;
    private UserMessages userMessages;
    private MovieManager movieManager;

    public MenuOptions() {
        bookManager = new BookManager();
        userMessages = new UserMessages();
        movieManager = new MovieManager();
    }

    public String getMainMenuList() {
        String menuOptions = "1. List Books\n" +
                "2. Checkout Book\n"+
                "3. Return Book\n"+
                "4. List Movies\n"+
                "5. Checkout Movie\n"+
                "6. Return Movie\n";
        return menuOptions;
    }

    public String chooseOption(String option) {
        String optionReturn = "Invalid Option";
        switch (option.toLowerCase()){
            case "1":
                optionReturn = bookManager.getAvailableItemsDetailsList();
                break;
            case "2":
                optionReturn = "Insert the book name";
                break;
            case "3":
                optionReturn = "Insert the book name";
                break;
            case "4":
                optionReturn = movieManager.getAvailableItemsDetailsList();
                break;
            case "5":
                optionReturn = "Insert the book name";
                break;
            case "6":
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
        String message = getCheckoutMessage(hasSuccess, "book");
        return message;
    }

    private String getCheckoutMessage(boolean hasSuccess, String item) {
        String message = "";
        if (hasSuccess){
            message = userMessages.getCheckoutSuccessfulMessage(item);
        }else {
            message = userMessages.getCheckoutUnsuccessfulMessage(item);
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
            message = userMessages.getReturnSuccessfulMessage("book");
        }else {
            message = userMessages.getReturnUnsuccessfulMessage("book");
        }
        return message;
    }

    public String checkoutMovie(String movieName) {
        boolean hasSuccess = movieManager.checkout(movieName);
        return getCheckoutMessage(hasSuccess, "movie");
    }
}
