package com.twu.book;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookManagerTest {

    List<Book> allLibraryBooks;
    BookManager bookManager;

    @Before
    public void setUp(){
        allLibraryBooks = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2009, "Author2");
        Book book3 = new Book("Book3", 2019, "Author3");
        allLibraryBooks.add(book1);
        allLibraryBooks.add(book2);
        allLibraryBooks.add(book3);

        bookManager = new BookManager();
    }

    @Test
    public void ShouldGetAllBooks() {
        List<Book> actualLibraryBooks = bookManager.getAll();

        assertEquals(allLibraryBooks, actualLibraryBooks);
    }

    @Test
    public void ShouldShowAllBooksDetails(){
        String expectedBookListDetails = "Name\t\tAuthor\t\tYear\n\n"+
                "Book1\t\tAuthor1\t\t2009\n"+
                "Book2\t\tAuthor2\t\t2009\n"+
                "Book3\t\tAuthor3\t\t2019";

        String actualBookListDetails = bookManager.getAllBooksDetailsList();

        assertEquals(expectedBookListDetails, actualBookListDetails);
    }
}
