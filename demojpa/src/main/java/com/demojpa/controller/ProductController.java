/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demojpa.controller;

import com.demojpa.entity.Product;
import com.demojpa.repo.ProductRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/api/product")
@Transactional
public class ProductController {
    
    @Autowired
    private ProductRepo repo;
    
    @RequestMapping(method = RequestMethod.POST)
    public Product save(@RequestBody Product product){        
        return repo.save(product);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Product> findAll(){
        return repo.findAllProduct();
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/category/{categoryId}")
    public List<Product> findAllByCategoryId(@PathVariable("categoryId") Long categoryId){
        return repo.findAllProductByCategoryId(categoryId);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Product findById(@PathVariable("id") Long id){
        return repo.findOne(id);
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean deleteById(@PathVariable("id") Long id){
        repo.delete(id);
        return true;
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public Product update(@RequestBody Product product){        
        return repo.save(product);
    }
}
