/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angkin.main;

import com.angkin.dao.DatabaseDAO;
import com.angkin.dao.mysql.DatabaseImpl;
import com.angkin.model.Product;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hendro Steven
 */
public class AppTester {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/dbangkin";
        String user = "root";
        String pass = "hst12345";

        Connection conn = null;

        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //create connection
            conn = DriverManager.getConnection(url, user, pass);
            DatabaseDAO dao = new DatabaseImpl(conn);
            for(Product product : dao.findAll()){
                System.out.println(product.getNama());
            }
            
            Product product = dao.findByCode("002");
            System.out.println(product.getPrice());
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
