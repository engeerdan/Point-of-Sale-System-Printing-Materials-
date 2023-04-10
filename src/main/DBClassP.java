/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBClassP {
    Connection con;
    String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
    String DB_URL = "jdbc:mysql://localhost:3306/cuyi_pos";
    
    DBClassP(  ) {
        try {
            Class.forName(JDBC_DRIVER);
            con = DriverManager.getConnection(DB_URL,"root","");
            
        } catch( ClassNotFoundException cnfe ) {
            System.out.println( cnfe );
        } catch( SQLException sqlException ) {
            System.out.println( sqlException );
             System.out.println( "catch" );
        }
    }
    
}
