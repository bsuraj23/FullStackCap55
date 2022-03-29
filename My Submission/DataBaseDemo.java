package sec.se.sec;

import java.sql.*;
import java.util.*;
class DataBase{
	String s;
	Connection con;
    Statement st;
    PreparedStatement ps;
	DataBase() throws Exception{
		Class.forName("org.postgresql.Driver");
		con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Sulphur","postgres","Mahee@1234");
		st=con.createStatement();
	}
	void createTb() throws Exception {
	     st.executeUpdate("create table login(name varchar(20),password varchar(20))");
	     System.out.println("login table is created");
	     
	     
	}
	void insert() throws Exception{
		ps=con.prepareStatement("insert into login values(?,?)");
		String name,password;
		Scanner ins=new Scanner(System.in);
		System.out.println("enter the name and password");
		name=ins.next();
		password=ins.next();
		ps.setString(1,name);
		ps.setString(2,password);
		ps.executeUpdate();
	}
	void show() throws Exception{
		ResultSet r=st.executeQuery("select * from login");
		while(r.next()) {
			System.out.println(r.getString(1)+" "+r.getString(2));
		}
		
	}
}
public class DataBaseDemo {

	public static void main(String[] args) throws Exception{
		DataBase d=new DataBase();
//	    d.createTb();
	    d.insert();
		try {
	    d.show();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
