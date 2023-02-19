package com.satya.creational.prototype;

public class Student implements Cloneable {
    private int age;
    private String name;

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Student(Student other) {
        this.name = other.getName();
        this.age = other.getAge();
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public static void main(String[] args) {
        Student student1 = new Student(2, "satya");
        Student student2 = student1.clone();
        student1.setAge(200);
        System.out.println(student2.age);
        System.out.println(student1.age);
    }
}
