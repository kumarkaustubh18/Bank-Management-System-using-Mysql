package com.example.demo.Customer;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class CustomerService {

  private  List<Customer> customers= new ArrayList<>(Arrays.asList(
            new Customer("ankit",acc(),18,"active"),
            new Customer("amit",acc(),21,"active"),
            new Customer("aman",acc(),24,"active")
    ));


    public  List<Customer> getAllCustomer() {
        return customers;
    }
    public Customer  getCustomer(String id)
    {
       return customers.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }


    public void addCustomer(Customer customer) {
     customers.add(customer);
    }

    public void updateCustomer(String id,Customer customer) {
        for(int i=0;i<customers.size();i++)
        {
            Customer c=customers.get(i);
            if(c.getId().equals(id)) {
                customers.set(i, customer);
                return;
            }

        }
    }

    public void deleteCustomer(String id) {

        for(Customer customer : customers){
            if(customer.getId().equals(id)){
                if(customer.getStatus().equals("inactive")){
                    customers.remove(customer);
                }
            }
        }
    }

    public String acc()
    {
        Random rnd = new Random();
        int x = 10000000 + rnd.nextInt(90000000);
        return String.valueOf(x);
    }
}
