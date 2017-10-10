/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.demojpa.controller;

import com.demojpa.entity.Category;
import com.demojpa.repo.CategoryRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/api/category")
@Transactional
public class CategoryController {
    
    @Autowired
    private CategoryRepo repo;
    
    @RequestMapping(method = RequestMethod.POST)
    public Category save(@RequestBody Category category){
        return repo.save(category);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Category> findAll(){
        return repo.findAllCategory();
    }
}
