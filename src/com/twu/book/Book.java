package com.twu.book;

public class Book {
    private String name;
    private Integer year;
    private String author;
    private boolean available;

    public Book(String name, Integer year, String author) {
        this.name = name;
        this.year = year;
        this.author = author;
        this.available = true;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
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

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
