package com.twu.book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {

    public List<Book> getAll() {
        List<Book> allBooks = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2099, "Author2");

        allBooks.add(book1);
        allBooks.add(book2);
        return allBooks;
    }
}
