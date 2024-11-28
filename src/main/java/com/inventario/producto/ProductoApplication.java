package com.inventario.producto;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class ProductoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductoApplication.class, args); 
    }

    @GetMapping("/proyecto")
    public MessageDto messageview() {
        return new MessageDto(LocalDate.now(), "inventario"); 
    }
}
