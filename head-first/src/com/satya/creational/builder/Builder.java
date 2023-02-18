package com.satya.creational.builder;

public abstract class Builder {
    protected String name;
    protected int age;
    protected Sex sex;
    protected String stream;

    public Builder name(String name) {
        this.name = name;
        return this;
    }

    public Builder age(int age) {
        this.age = age;
        return this;
    }

    public Builder sex(Sex sex) {
        this.sex = sex;
        return this;
    }

    public Builder stream(String stream) {
        this.stream = stream;
        return this;
    }
}
