package com.example.demo;

import com.example.demo.staff.Staff;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
// @RestController  I removed this from demo with the @GetMapping and put in the controller Class
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
//	@GetMapping    // In order to be served as a restful endpoint we need to annotate it
//	public List<Staff> hello(){    //method, returns a json array
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
