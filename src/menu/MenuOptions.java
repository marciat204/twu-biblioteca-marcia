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

    public String chooseOption(String option) {
        String optionReturn = "Invalid Option";
        if (option.equals(Integer.toString(1))) {
            optionReturn = bookManager.getAllBooksDetailsList();
        }else if (option.equals("Quit")){
            optionReturn = "Quit";
        }
        return optionReturn;
    }
}
