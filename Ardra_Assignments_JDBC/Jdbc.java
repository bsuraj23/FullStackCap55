import java.sql.*;
public class Jdbc {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/capg_schema1";
        String username = "root";
        String password = "1234";
        Connection con = DriverManager.getConnection(url, username, password);

        String query = "select UserName from student where ID=4";
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);
        rs.next();
        if (con != null) {
            System.out.println("Database Connected successfully");
        } else
            System.out.println("Database Connection failed");



        String name = rs.getString("UserName");
        System.out.println(name);
        st.close();
        con.close();
    }
}

