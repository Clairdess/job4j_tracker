package ru.job4j.pojo;

import java.time.LocalDateTime;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setDate(LocalDateTime.now());
        student.setFullName("Davydov Daniel");
        student.setGroup("Job4j");
        System.out.println(student.getDate());
        System.out.println(student.getFullName());
        System.out.println(student.getGroup());
    }
}
