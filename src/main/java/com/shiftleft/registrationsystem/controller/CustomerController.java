package com.shiftleft.registrationsystem.controller;

import com.shiftleft.registrationsystem.model.Customer;
import com.shiftleft.registrationsystem.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {
    @Autowired
    private CustomerService customerService;


    @PostMapping("/add")
    public String addCustomer(@RequestBody Customer customer){
        System.out.println(customer);
        customerService.saveCustomer(customer);
        return "New customer added";
    }

    @PutMapping("/remove/course")
    public String removeCourse(@RequestParam String courseName, @RequestParam String contactNumber){
        customerService.removeCourse(courseName, contactNumber);
        return "Course successfully removed from user";
    }

    @GetMapping("/user")
    public ResponseEntity<Customer> getUserData(@RequestParam String firstname,
                                      @RequestParam String lastName, @RequestParam String contactNumber)
    {
        return new ResponseEntity<>(customerService.getCustomerData(firstname, lastName, contactNumber), HttpStatus.OK);
    }

}
