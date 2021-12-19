package com.example.customermanagementsystem.data.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
@AllArgsConstructor

@Data
public class Customer {
    @Id
    int id;

    String firstName;
    String lastName;
    String email;
    String phoneNumber;
    String Address;




}
