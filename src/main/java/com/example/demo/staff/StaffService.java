package com.example.demo.staff;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StaffService {
    public List<Staff> getStaff(){    //method, returns a json array
        return List.of(
                new Staff(
                        1L,
                        "Kelly",
                        "kelly@gmail.com",
                        LocalDate.of(2000, Month.JANUARY,1),
                        24
                )
        );
    }
}
