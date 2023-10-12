package com.shiftleft.registrationsystem.service;

import com.shiftleft.registrationsystem.model.Customer;

public interface CustomerService {
    public Customer saveCustomer(Customer customer);

    public int removeCourse(String courseName, String contactNumber);

    public Customer getCustomerData(String firstname, String lastName, String contactNumber);

//    public Customer addCourse(int courseID, int customerID);
}
