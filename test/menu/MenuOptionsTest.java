package menu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuOptionsTest {

    @Test
    public void ShouldShowMainMenuOptions(){
        String expectedMainMenuOptions = "1. List Books";
        MenuOptions menuOptions = new MenuOptions();

        String actualMainMenuOptions = menuOptions.getMainMenuList();

        assertEquals(expectedMainMenuOptions, actualMainMenuOptions);
    }
}
