package com.example.demo.staff;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;


// the service layer is responsible for business logic
@Service // similar to @Component but the service is "better" like it meant to be a service class
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
