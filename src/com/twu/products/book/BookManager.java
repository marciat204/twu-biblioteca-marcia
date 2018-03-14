package com.twu.products.book;

import com.twu.products.Item;
import com.twu.products.ItemManager;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class BookManager extends ItemManager{

    private List<Book> availableBooks;
    private List<Book> allBooks;

    public BookManager(){
        super();
        allItems = generateBooksMock();
    }

    public List<Item> getAll() {
        return allItems;
    }

    private List<Item> generateBooksMock(){
        List<Item> allBooksMock = new ArrayList<>();
        Book book1 = new Book("Book1", 2009, "Author1");
        Book book2 = new Book("Book2", 2009, "Author2");
        Book book3 = new Book("Book3", 2019, "Author3");
        Book book4 = new Book("Book4", 2029, "Author3");
        book4.setAvailable(false);

        allBooksMock.add(book1);
        allBooksMock.add(book2);
        allBooksMock.add(book3);
        allBooksMock.add(book4);
        return allBooksMock;
    }

    public List<Book> getAvailableBooks() {
        availableBooks = allBooks.stream().filter(b -> b.isAvailable()).collect(Collectors.toList());
        return availableBooks;
    }

    @Override
    public String getHeader() {
        return "Name\t\tAuthor\t\tYear\n";
    }
}
