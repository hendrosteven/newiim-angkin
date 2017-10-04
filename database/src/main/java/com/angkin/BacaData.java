/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.angkin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Hendro Steven
 */
public class BacaData {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/dbangkin";
        String user = "root";
        String pass = "hst12345";

        Connection conn = null;

        try {
            //load driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            //create connection
            conn = DriverManager.getConnection(url, user, pass);
            //create statement object
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select code,nama,price from tblproduct");
            while (rs.next()) {
                System.out.println(rs.getString("code") + " " + rs.getString("nama") + " " + rs.getDouble("price"));
            }
            st.close();
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
