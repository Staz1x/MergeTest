package com.example.orders.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customers {

    @Id
    @GeneratedValue
    private Long id;
    private String customerName;
    private String ssn;


    public Customers(String customerName, String ssn) {
        this.customerName = customerName;
        this.ssn = ssn;


    }
}
