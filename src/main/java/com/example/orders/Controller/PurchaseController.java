package com.example.orders.Controller;

import com.example.orders.Model.Purchases;
import com.example.orders.Repository.PurchaseRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("purchases")
public class PurchaseController {

    private final PurchaseRepo purchaseRepo;

    private static final Logger log = LoggerFactory.getLogger(PurchaseController.class);

    @Autowired
    private RestTemplate restTemplate;

    public PurchaseController(PurchaseRepo purchaseRepo){
        this.purchaseRepo = purchaseRepo;
    }

    @RequestMapping
    public List<Purchases> getAllPurchases(){
        log.error("Showing all purchases");
        return purchaseRepo.findAll();
    }

    @PostMapping("purchase/add")
    public List<Purchases> addPurchase(@RequestBody Purchases p) {
        purchaseRepo.save(p);
        log.error("Purchase by " + p.getCustomerId() + " was added");
        return purchaseRepo.findAll();
    }


    // http://localhost:8080/orders/{customerId}
    // Denna returnerar alla köp för en kund baserat på kundens id
    public List<Purchases> getCustomersOrders(long id){
        return purchaseRepo.findAllByCustomersId(id);
    }

    @RequestMapping("purchase/{customerId}")
    public List<Purchases> ordersByCustomersId(@PathVariable long customerId){
        log.error("Showing purchasesByCustomerId " + customerId);
        return getCustomersOrders(customerId);
    }

}
