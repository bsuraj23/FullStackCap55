import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.io.ClassNotFoundException;
//import java.io.SQLException;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;


public class JDBC
{ 
public static void display()

{   try
{
    int id;
   //int count=0;
    String name;
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost/jdbc_ex?"
              + "user=root&password=1234");
    PreparedStatement st = con.prepareStatement("select * from student ");
    ResultSet r1=st.executeQuery();
 System.out.println();
System.out.print("\tID");
System.out.print("\t\t");
System.out.print("NAME");
System.out.println();

System.out.println("----------------------------------------");

System.out.println();



	while(r1.next())
	           {

	              id=r1.getInt("id");
 System.out.print("\t"+id);
	             

System.out.print("\t\t");

	              name=r1.getString("name");
	              System.out.print(name);
System.out.println();

	              //out.println("4");
	           }


}
catch(Exception e)
{
System.out.println(e);
}

    }
public static void main(String[] args)
{
	//jdbc2 j1=new jdbc2();
	display();
}
}