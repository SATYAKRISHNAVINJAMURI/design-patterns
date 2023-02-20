package com.satya.behavourial.visitor;

import java.util.List;

public class VisitorClient {
    public static void main(String[] args) {
        Student bTechStudent = new BTechStudent("satya", "satya.btech");
        Student mtechStudent = new MTechStudent("vish", "satya.mtech");
        List<Student> students = List.of(bTechStudent, mtechStudent);
        EmailSender emailSender = new ExamEmailSender();
        students.forEach(student -> student.accept(emailSender));
        EmailSender festEmailSender = new FestEmailSender();
        students.forEach(student -> student.accept(festEmailSender));
    }
}
