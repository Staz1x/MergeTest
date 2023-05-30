package com.example.orders.Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Items {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private double price;
    private int balance;


    public Items(String name, double price, int balance) {
        this.name = name;
        this.price = price;
        this.balance = balance;
    }
}
