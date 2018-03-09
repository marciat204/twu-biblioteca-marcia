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
        String expectedMainMenuOptions = "1. List Books";
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
}
