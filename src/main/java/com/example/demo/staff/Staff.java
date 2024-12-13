package com.example.demo.staff;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity // for Hibernate

// Consider using Lombok to reduce boilerplate code!

@Data // Generates getters and setters for all fields, equals(), hashCode(), and toString() methods.
@AllArgsConstructor // Generates a constructor with one parameter for each field in the class.
@NoArgsConstructor // Generates a no-argument constructor for the class.
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


}
