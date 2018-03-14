package com.twu.products.book;

import com.twu.products.Item;

public class Book extends Item {
    private String author;

    public Book(String name, Integer year, String author) {
        super(name, year);
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEqual = false;

        if (obj != null && Book.class.isAssignableFrom(obj.getClass())){
            Book inputObj = (Book) obj;
            isEqual = inputObj.getName().equals(this.getName())
                    && inputObj.getAuthor().equals(this.getAuthor())
                    && inputObj.getYear().equals(this.getYear());
        }
        return isEqual;
    }

    @Override
    public String toString() {
        return this.getName()+ "\t\t" + this.getAuthor() + "\t\t" + this.getYear();
    }

}
