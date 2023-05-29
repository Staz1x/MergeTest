package com.example.orders.Repository;

import com.example.orders.Model.Purchases;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PurchaseRepo extends JpaRepository<Purchases, Long> {

    public List<Purchases> findAllByCustomerId(long id);
}
