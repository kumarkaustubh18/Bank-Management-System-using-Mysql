package com.example.demo.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public  List<Customer> getAllCustomer() {
        //return customers;
     List<Customer>customer=new ArrayList<>();

        customerRepository.findAll().forEach(customer::add);
        return customer;
    }
    public Optional<Customer> getCustomer(String id)
    {
      // return customers.stream().filter(t->t.getId().equals(id)).findFirst().get();
     return customerRepository.findById(id);
    }


    public void addCustomer(Customer customer) {
        //customers.add(customer);
         customerRepository.save(customer);
    }

    public void updateCustomer(String id,Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(String id) {

        customerRepository.deleteById(id);
    }
    ///////////////////////////////////////////////////////
    public List<Customer> getActiveCustomer()
    {

        List<Customer> id=customerRepository.getActiveCustomer();

        return  id;
    }

    public List<Customer> getInactiveCustomer()
    {

        List<Customer> id=customerRepository.getInactiveCustomer();

        return  id;
    }


}
