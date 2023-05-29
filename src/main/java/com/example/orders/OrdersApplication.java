package com.example.orders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class OrdersApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrdersApplication.class, args);
    }

   /* @Bean
    public CommandLineRunner pojo(PurchaseRepo purchaseRepo){
        return args ->{

            Customers c1 = new Customers("Anna Alfredsson", "0000-00-00");

            Purchases p1 = new Purchases();

            purchaseRepo.save(p1);
        };
    }*/


   /* @Bean
    RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate;
    }*/

}
