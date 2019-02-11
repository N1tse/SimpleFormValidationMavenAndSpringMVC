/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pojos;

import static com.pojos.DataConn.getConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author ntsep
 */
public class UserDao {
    private final Connection conn = getConnection();
    
    
    public String registerUser(String username,String password,String fname,String lname,int freepasses,String postalcode){
        
        try{
            PreparedStatement q = conn.prepareStatement("INSERT INTO USERS (USERNAME,PASSWORD,FNAME,LNAME,FREEPASSES,POSTALCODE) VALUES (?,?,?,?,?,?)");
            q.setString(1, username);
            q.setString(2, password);
            q.setString(3, fname);
            q.setString(4, lname);
            q.setInt(5, freepasses);
            q.setString(6, postalcode);
            q.executeUpdate();
            return "An insert has been made!";
        }catch(Exception e){
            System.out.println(e);
        }
        return "Opps something went wrong!!!";
    }
}
