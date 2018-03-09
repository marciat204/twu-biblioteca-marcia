package com.twu.book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public List<Book> getAll() {
        List<Book> allBooks = generateBooksMock();
        return allBooks;
    }

    private List<Book> generateBooksMock(){
        List<Book> allBooksMock = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2099, "Author2");

        allBooksMock.add(book1);
        allBooksMock.add(book2);
        return allBooksMock;
    }
}
