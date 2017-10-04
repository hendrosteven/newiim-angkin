/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angkin.dao.mysql;

import com.angkin.dao.DatabaseDAO;
import com.angkin.model.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hendro Steven
 */
public class DatabaseImpl implements DatabaseDAO{
    
    private Connection conn;
    
    public DatabaseImpl(Connection conn){
        this.conn = conn;
    }

    @Override
    public List<Product> findAll() {
        String sql = "select code, nama, price from tblproduct";
        List<Product> data = new ArrayList<Product>();
        try{
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                Product product = new Product();
                product.setCode(rs.getString("code"));
                product.setNama(rs.getString("nama"));
                product.setPrice(rs.getDouble("price"));
                data.add(product);
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return data;
    }

    @Override
    public Product findByCode(String code) {
        String sql = "select code, nama, price from tblproduct where code='"+code+"'";
        Product product = null;
        try{
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next()){
                product = new Product();
                product.setCode(rs.getString("code"));
                product.setNama(rs.getString("nama"));
                product.setPrice(rs.getDouble("price"));
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return product;
    }
    
}
