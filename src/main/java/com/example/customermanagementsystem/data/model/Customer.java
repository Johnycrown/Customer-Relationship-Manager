package com.example.customermanagementsystem.data.model;

import org.springframework.data.annotation.Id;

public class Customer {
    @Id
    int id;
    String firstName;
    String lastName;
    String email;



}
