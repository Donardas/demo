package com.example.demo.students;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Student {

    private Integer id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student() {
    }

    public Student(Integer id, String name, String email, LocalDate dob, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

    public Student(String name, String email, LocalDate dob, Integer age) {
        this.name = name;
        this.email = email;
        this.dob = dob;
        this.age = age;
    }

}
