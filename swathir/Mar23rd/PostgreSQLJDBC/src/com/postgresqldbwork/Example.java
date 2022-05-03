/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.postgresqldbwork;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Swathi
 */
public class Example {
    
    private final String url ="jdbc:postgresql://localhost/postgresqljdbc";
    private final String user = "postgres";
    private final String password = "1803";
    
    public Connection connect()throws SQLException{
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Successfully Connected to Postgresql Server.");
            Statement stmt = conn.createStatement();
            String sql ="CREATE TABLE extable"+
                    "(id INTEGER not NULL,"+
                    "first VARCHAR(255),"+
                    "last VARCHAR(255),"+
                    "age INTEGER, "+
                    "PRIMARY KEY( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Table is created Successfully in Database");
            sql = "INSERT INTO extable VALUES (991,'SWATHI','R',21)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO extable VALUES(992,'HEMANTH','R',14)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO extable VALUES(993,'S','SHWETHA',27)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO extable VALUES(994,'A','RAJ',19)";
            stmt.executeUpdate(sql);
            System.out.println("Records are successfully inserted into table");
            
            System.out.println("Records in the table");
            
            String query = "SELECT * FROM extable";
                ResultSet rs = stmt.executeQuery(query);
                while(rs.next()){
                    System.out.println(rs.getInt("id")+" ");
                    System.out.println(rs.getString("first")+" ");
                    System.out.println(rs.getString("last")+" ");
                    System.out.println(rs.getInt("age"));
                }
                stmt.close();
                conn.close();
                System.out.println("Connection closed successfully");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
        return conn;
   }


    /**
     * @param args the command line arguments
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Example ex =new Example();
        ex.connect();
    }
    
}