package com.example.demo.Customer;

public class Customer {


    private String name;
    private String id;
    private int age;

    private String status;

    public Customer() {
    }



    public Customer(String name, String id, int age, String status) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.status=status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
