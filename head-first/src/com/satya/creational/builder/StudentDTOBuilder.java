package com.satya.creational.builder;

public class StudentDTOBuilder extends Builder {
    public StudentDTO build() {
        return new StudentDTO(name, age, sex, stream);
    }
}
