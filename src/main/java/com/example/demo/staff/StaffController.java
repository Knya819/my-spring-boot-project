package com.example.demo.staff;


import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

@RestController
@RequestMapping(path = "api/v1/staff")
@AllArgsConstructor // Use AllArgsConstructor annotation to inject dependencies easier!
public class StaffController {

    //No need of Autowired because of @AllArgsConstructor
    private final StaffService staffService;
    private final StaffRepository staffRepository;


    @GetMapping// Consider writing an endpoint ex. @GetMapping("/staff")
    public List<Staff> getStaff(){
        return staffService.getStaff();
    }

    @GetMapping("/all")// Consider writing an endpoint ex. @GetMapping(/staff)
    public List<Staff> getAllStaff(){
        return staffRepository.findAll();
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
