package com.satya.creational.builder;

public class StudentDTO {
    private String name;
    private int age;
    private Sex sex;
    private String stream;

    StudentDTO(String name, int age, Sex sex, String stream) {
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
        return "StudentDTO{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", stream='" + stream + '\'' +
                '}';
    }
}
