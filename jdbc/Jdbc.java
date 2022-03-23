
import  java.sql.*;
public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String pass="1234";
		String query="select*from Student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,username,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		
		String userdate="";
		
		while(rs.next())
		{
		String userdata=rs.getInt(1)+" : "+rs.getString(2);
		System.out.println(userdata);
		}
		st.close();
		con.close();
	}

}
