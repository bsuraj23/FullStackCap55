package com.PostgreSql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Vema Rahul Sairam
 */
public class jdbc {

    private final String url ="jdbc:postgresql://localhost/MyDatabase";
    private final String user = "postgres";
    private final String password = "amrita@123";

    public Connection connect()throws SQLException{
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("Successfully Connected to Postgresql Server.");
            Statement stmt = conn.createStatement();
            String sql ="CREATE TABLE connectionexample"+
                    "(id INTEGER not NULL,"+
                    "first VARCHAR(255),"+
                    "last VARCHAR(255),"+
                    "age INTEGER, "+
                    "PRIMARY KEY( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Table is created Successfully in Database");
            sql = "INSERT INTO connectionexample VALUES (1,'Vema','Rahul',21)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO connectionexample VALUES(2,'Sai','Ram',16)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO connectionexample VALUES(3,'AAA','BBB',21)";
            stmt.executeUpdate(sql);
            sql = "INSERT INTO connectionexample VALUES(4,'CCC','DDD',21)";
            stmt.executeUpdate(sql);
            System.out.println("Records are successfully inserted into table");

            System.out.println("Records in the table");

            String query = "SELECT * FROM connectionexample";
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
        jdbc ex = new jdbc();
        ex.connect();
    }

}
