package com.shiftleft.registrationsystem.service;

import com.shiftleft.registrationsystem.model.Customer;
import com.shiftleft.registrationsystem.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;
    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public int removeCourse(String course, String contactNumber) {
        return customerRepository.removeCourse(course, contactNumber);
    }

    @Override
    public Customer getCustomerData(String firstname, String lastName, String contactNumber) {
        return customerRepository.findByFirstNameAndLastNameAndContactNumber(firstname,lastName,contactNumber);
    }

//    @Override
//    public Customer addCourse(int courseID, int customerID) {
//        return customerRepository.registerCourse(courseID,customerID);
//    }
}
