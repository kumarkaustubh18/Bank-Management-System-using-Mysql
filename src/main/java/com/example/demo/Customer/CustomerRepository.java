package com.example.demo.Customer;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public  interface CustomerRepository extends CrudRepository<Customer,String> {

    @Query(value = "select * from customer where status='active'", nativeQuery = true)
    List<Customer> getActiveCustomer();

    @Query(value = "select * from customer where status='inactive'", nativeQuery = true)
    List<Customer> getInactiveCustomer();
}
