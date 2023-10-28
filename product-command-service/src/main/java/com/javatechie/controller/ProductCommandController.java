package com.javatechie.controller;

import com.javatechie.dto.ProductEvent;
import com.javatechie.entity.Product;
import com.javatechie.service.ProductCommandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/products")
public class ProductCommandController {

    @Autowired
    private ProductCommandService commandService;

    @PostMapping
    public Product createProduct(@RequestBody ProductEvent productEvent) {
        return commandService.createProduct(productEvent);
    }

    @PutMapping("/{uuid}")
    public Product updateProduct(@PathVariable UUID uuid, @RequestBody ProductEvent productEvent) {
        return commandService.updateProduct(uuid, productEvent);
    }
}
