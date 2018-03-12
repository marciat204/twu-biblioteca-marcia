package com.twu.book;

import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class BookManager {

    private List<Book> availableBooks;
    private List<Book> allBooks;

    public BookManager(){
        allBooks = generateBooksMock();
        availableBooks = getAvailableBooks();
    }

    public List<Book> getAll() {
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
        StringJoiner joiner = new StringJoiner("\n");
        joiner.add("Name\t\tAuthor\t\tYear\n");
        for (Book book: getAvailableBooks()) {
            joiner.add(book.toString());
        }
        String allBookDetailsList = joiner.toString();
        return allBookDetailsList;
    }

    public List<Book> getAvailableBooks() {
        availableBooks = allBooks.stream().filter(b -> b.isAvailable()).collect(Collectors.toList());
        return availableBooks;
    }

    public boolean checkout(String bookName) {
        int bookIndex = findBookIndex(bookName);
        boolean success = checkoutStatus(bookIndex);
        return success;
    }

    private boolean checkoutStatus(int bookIndex) {
        boolean success = false;
        if (bookIndex >= 0) {
            Book checkedBook = allBooks.get(bookIndex);
            checkedBook.setAvailable(false);
            allBooks.set(bookIndex, checkedBook);
            success = true;
        }
        return success;
    }

    private int findBookIndex(String bookName) {
        int bookIndex = -1;
        int counter = 0;
        for (Book book: allBooks) {
            if (book.getName().equals(bookName) && book.isAvailable()){
                bookIndex = counter;
            }
            counter++;
        }
        return bookIndex;
    }
}
