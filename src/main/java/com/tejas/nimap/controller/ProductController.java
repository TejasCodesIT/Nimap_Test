package com.tejas.nimap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.tejas.nimap.model.Product;
import com.tejas.nimap.services.ProductService;

@RestController
@RequestMapping("api/products") 
public class ProductController {

    @Autowired
    private ProductService productService;

    
    @GetMapping
    public List<Product> getProducts(@RequestParam(defaultValue = "0") int page,
                                     @RequestParam(defaultValue = "2") int size) {
        return productService.getProducts(page, size);
    }

   // POST: Create a new product
    @PostMapping
    public String createProduct(@RequestBody Product product) {
        return productService.insertProduct(product);
    }

  
    @GetMapping("/{di}")
    public Product getProductById(@PathVariable(value = "di") int id) {
        return productService.getProductById(id);
    }


    @PutMapping("/{di}")
    public String updateProduct(@PathVariable(value = "di") int id, @RequestBody Product product) {
        return productService.updateById(product, id);
    }

   
    @DeleteMapping("/{di}")
    public String deleteProduct(@PathVariable(value = "di") int id) {
        return productService.deleteProduct(id);
    }
}































//Name : - Tejas Wakchaure
//Batch : - JSD Mumbai Batch
//Mob :- 9022215242 
//Email : - wakchaurtejas66@gmail.com
