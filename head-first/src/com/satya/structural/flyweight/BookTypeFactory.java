package com.satya.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BookTypeFactory {
    private static Map<String, BookType> cache = new HashMap<>();

    public static Map<String, BookType> getCache() {
        return cache;
    }

    public static BookType getBookType(String type, String author, String publisher) {
        String key = type.concat(author).concat(publisher);
        BookType bookType = cache.get(key);
        if(bookType == null) {
            cache.put(key, new BookType(type, author, publisher));
        }
        return cache.get(key);
    }
}
