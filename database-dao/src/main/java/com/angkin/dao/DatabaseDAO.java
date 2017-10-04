/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angkin.dao;

import com.angkin.model.Product;
import java.util.List;

/**
 *
 * @author Hendro Steven
 */
public interface DatabaseDAO {

    public List<Product> findAll();

    public Product findByCode(String code);
}
