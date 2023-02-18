package com.satya.creational.builder;

public class Student {
    private String name;
    private int age;
    private Sex sex;
    private String stream;

    Student(String name, int age, Sex sex, String stream) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.stream = stream;
    }

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", stream='" + stream + '\'' +
                '}';
    }
}
