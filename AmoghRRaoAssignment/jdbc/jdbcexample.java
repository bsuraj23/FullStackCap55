import java.sql.*;

public class jdbcexample {
    public static void main(String[] args) throws Exception {
        Connection con = null;
        String dbase = "jdbc:mysql://localhost:3306/jdbc_example";
        String query = "select Name from compaines where revenue>100";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection Established");
        } catch (Exception e) {
            System.out.println("Error in connection " + e);
        }
        con = DriverManager.getConnection(dbase, "root", "root");
        Statement st = con.createStatement();

        ResultSet rs = st.executeQuery(query);
        rs.next();

        String name = rs.getString("Name");
        System.out.println(name);
        st.close();
        con.close();
    }

}