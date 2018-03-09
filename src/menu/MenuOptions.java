package menu;

import com.twu.book.BookManager;

public class MenuOptions {
    private BookManager bookManager;

    public MenuOptions() {
        bookManager = new BookManager();
    }

    public String getMainMenuList() {
        return "1. List Books";
    }

    public String chooseOption(int option) {
        return bookManager.getAllBooksDetailsList();
    }
}
