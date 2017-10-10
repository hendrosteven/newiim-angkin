/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demojpa.repo;

import com.demojpa.entity.Product;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Hendro Steven
 */
public interface ProductRepo extends CrudRepository<Product, Long>{
    
    @Query("select p from Product p")
    public List<Product> findAllProduct();
    
    @Query("select p from Product p where p.category.id = :categoryId")
    public List<Product> findAllProductByCategoryId(@Param("categoryId") Long categoryId);
    
    
}
