package com.example.demo.staff;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/staff")
public class StaffController {

    private final StaffService staffService;

    @Autowired //we are say that the StaffService should be autowired for us
    public StaffController (StaffService staffService){
        this.staffService = staffService;
    }

    @GetMapping
    public List<Staff> getStaff(){
        return staffService.getStaff();
    }


    // @GetMapping    // In order to be served as a restful endpoint we need to annotate it
//	public List<Staff> getStaff(){    //method, returns a json array
//		return List.of(
//				new Staff(
//						1L,
//						"Kelly",
//						"kelly@gmail.com",
//						LocalDate.of(2000, Month.JANUARY,1),
//						24
//				)
//		);
//	}
}
