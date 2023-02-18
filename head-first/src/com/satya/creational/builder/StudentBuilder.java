package com.satya.creational.builder;

public class StudentBuilder extends Builder{
    public Student build() {
        return new Student(name, age, sex, stream);
    }
}
