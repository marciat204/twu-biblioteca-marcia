package com.twu.book;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;

public class BookManager {

    public List<Book> getAll() {
        List<Book> allBooks = generateBooksMock();
        return allBooks;
    }

    private List<Book> generateBooksMock(){
        List<Book> allBooksMock = new ArrayList<Book>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2009, "Author2");
        Book book3 = new Book("Book3", 2019, "Author3");

        allBooksMock.add(book1);
        allBooksMock.add(book2);
        allBooksMock.add(book3);
        return allBooksMock;
    }

    public String getAllBooksDetailsList() {
        List<Book> allBooks = getAll();
        StringJoiner joiner = new StringJoiner("\n");
        joiner.add("Name\t\tAuthor\t\tYear\n");
        for (Book book: allBooks) {
            joiner.add(book.toString());
        }
        String allBookDetailsList = joiner.toString();
        return allBookDetailsList;
    }
}
