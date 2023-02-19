package com.satya.structural.flyweight;

public class FlyWeightDriver {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Poter", 20, "Fiction", "Satya", "Sri Satya");
        Book book2 = new Book("Lions Gate", 20, "Fiction", "Satya", "Sri Satya");
        Book book3 = new Book("Disnep World", 20, "Fiction", "Satya", "Sri Satya");
        System.out.println(BookTypeFactory.getCache().size());
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
