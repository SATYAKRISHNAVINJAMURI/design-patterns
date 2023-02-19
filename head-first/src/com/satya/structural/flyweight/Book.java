package com.satya.structural.flyweight;

public class Book {
    private String name;
    private int cost;
    private BookType bookType;

    public BookType getBookType() {
        return bookType;
    }

    public Book(String name, int cost, String type, String author, String publisher) {
        this.name = name;
        this.cost = cost;
        this.bookType = BookTypeFactory.getBookType(type, author, publisher);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", type='" + bookType;
    }
}
