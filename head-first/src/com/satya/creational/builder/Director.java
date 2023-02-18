package com.satya.creational.builder;

public class Director {
    public void buildScienceStudent(Builder builder) {
        builder.name("Satya")
                .age(2)
                .sex(Sex.FEMALE)
                .stream("SCIENCE");
    }

    public void buildCommerceStudent(Builder builder) {
        builder.name("Satya")
                .age(2)
                .sex(Sex.FEMALE)
                .stream("COMMERCE");
    }
}
