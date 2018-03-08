package com.twu.book;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookManagerTest {

    List<Book> allLibraryBooks;

    @Before
    public void setUp(){
        allLibraryBooks = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2099, "Author2");

        allLibraryBooks.add(book1);
        allLibraryBooks.add(book2);
    }

    @Test
    public void ShouldGetAllBooks() {
        BookManager bookManager = new BookManager();
        List<Book> actualLibraryBooks = bookManager.getAll();

        assertEquals(allLibraryBooks, actualLibraryBooks);
    }
}
