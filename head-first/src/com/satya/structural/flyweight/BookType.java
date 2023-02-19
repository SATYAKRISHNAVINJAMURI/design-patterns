package com.satya.structural.flyweight;

public class BookType {
    private String type;
    private String author;
    private String publisher;

    public String getType() {
        return type;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public BookType(String type, String author, String publisher) {
        this.type = type;
        this.author = author;
        this.publisher = publisher;
    }
}
