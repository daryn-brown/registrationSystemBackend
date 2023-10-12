package com.shiftleft.registrationsystem.repository;

import com.shiftleft.registrationsystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer> {
    @Transactional
    @Modifying
    @Query("update Customer c set c.registeredCourses = ?1 where c.contactNumber = ?2")
    int removeCourse(String registeredCourses, String contactNumber);

    Customer findByFirstNameAndLastNameAndContactNumber(String firstName, String lastName,
                                                        String contactNumber);
}
