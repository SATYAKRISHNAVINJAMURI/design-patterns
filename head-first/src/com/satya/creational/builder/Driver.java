package com.satya.creational.builder;

public class Driver {
    public static void main(String[] args) {
        Director director = new Director();
        StudentDTOBuilder studentBuilder = new StudentDTOBuilder();
        director.buildCommerceStudent(studentBuilder);
        director.buildScienceStudent(studentBuilder);
        System.out.println(studentBuilder.build());
    }
}
