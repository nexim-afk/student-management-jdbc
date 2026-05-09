import java.sql.*;

public class StudentManagement {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/college";
        String user = "root";
        String password = "root";

        try {

            Connection con = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO students VALUES (1, 'Nayara', 95)";

            Statement st = con.createStatement();

            st.executeUpdate(query);

            System.out.println("Data Inserted Successfully");

            con.close();

        } catch (Exception e) {

            System.out.println(e);

        }
    }
}
