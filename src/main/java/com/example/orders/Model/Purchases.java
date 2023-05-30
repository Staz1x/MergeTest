package com.example.orders.Model;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Purchases {

    @Id
    @GeneratedValue
    private Long id;
    private String date;
    private Long customerId;

    //@ElementCollection
    //private List <Long> Items;
}
