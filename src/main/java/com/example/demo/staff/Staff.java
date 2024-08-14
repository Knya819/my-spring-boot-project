package com.example.demo.staff;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity // for Hibernate
@Table

public class Staff {
    @Id
    @SequenceGenerator(name = "staff_sequence",
                      sequenceName = "staff_sequence",
                      allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "staff_sequence"
    )
    private long id;
    private String name;
    private String email;
    private LocalDate DOB;
    private Integer age;


    public Staff() {
    }

    public Staff(long id,
                 String name,
                 String email,
                 LocalDate DOB,
                 Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public Staff(String name,
                 String email,
                 LocalDate DOB,
                 Integer age) {
        this.name = name;
        this.email = email;
        this.DOB = DOB;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", DOB=" + DOB +
                ", age=" + age +
                '}';
    }

}
