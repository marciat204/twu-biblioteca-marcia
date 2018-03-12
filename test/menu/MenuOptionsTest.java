package menu;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuOptionsTest {

    MenuOptions menuOptions;

    @Before
    public void setUp(){
        menuOptions = new MenuOptions();
    }

    @Test
    public void ShouldShowMainMenuOptions(){
        String expectedMainMenuOptions = "1. List Books\n" +
                "2. Checkout Book\n"+
                "3. Return Book\n";
        String actualMainMenuOptions = menuOptions.getMainMenuList();

        assertEquals(expectedMainMenuOptions, actualMainMenuOptions);
    }

    @Test
    public void ShouldChooseListBookOptionFromMainMenu(){
        String expectedBookList = "Name\t\tAuthor\t\tYear\n\n"+
                "Book1\t\tAuthor1\t\t2009\n"+
                "Book2\t\tAuthor2\t\t2009\n"+
                "Book3\t\tAuthor3\t\t2019";

        String actualBookList = menuOptions.chooseOption(Integer.toString(1));

        assertEquals(expectedBookList, actualBookList);
    }

    @Test
    public void ShouldShowInvalidOptionMessageAtMainMenu(){
        String expectedMessage = "Invalid Option";

        String actualMessage = menuOptions.chooseOption(Integer.toString(-5));

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldQuitMainMenu(){
        String expectedMessage = "Quit";

        String actualMessage = menuOptions.chooseOption("Quit");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldCheckoutBook() {
        String expectedAllAvailableBooksList = "Name\t\tAuthor\t\tYear\n\n"+
                "Book1\t\tAuthor1\t\t2009\n"+
                "Book2\t\tAuthor2\t\t2009";

        menuOptions.checkoutBook("Book3");
        String actualAllAvailableBooksList = menuOptions.chooseOption(Integer.toString(1));

        assertEquals(expectedAllAvailableBooksList, actualAllAvailableBooksList);
    }

    @Test
    public void ShouldDisplaySuccessCheckoutMessage(){
        String expectedMessage = "Thank you! Enjoy the book";

        String actualMessage = menuOptions.checkoutBook("Book3");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayUnsuccessfulCheckoutMessage(){
        String expectedMessage = "That book is not available";

        String actualMessage = menuOptions.checkoutBook("Book4");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldReturnBook() {
        String expectedAllAvailableBooksList = "Name\t\tAuthor\t\tYear\n\n"+
                "Book1\t\tAuthor1\t\t2009\n"+
                "Book2\t\tAuthor2\t\t2009\n"+
                "Book3\t\tAuthor3\t\t2019\n"+
                "Book4\t\tAuthor3\t\t2029";

        menuOptions.returnBook("Book4");
        String actualAllAvailableBooksList = menuOptions.chooseOption(Integer.toString(1));

        assertEquals(expectedAllAvailableBooksList, actualAllAvailableBooksList);
    }

    @Test
    public void ShouldDisplaySuccessReturnMessage(){
        String expectedMessage = "Thank you for returning the book";

        String actualMessage = menuOptions.returnBook("Book4");

        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    public void ShouldDisplayUnsuccessfulReturnMessage(){
        String expectedMessage = "That is not a valid book to return.";

        String actualMessage = menuOptions.returnBook("Book45");

        assertEquals(expectedMessage, actualMessage);
    }
}
