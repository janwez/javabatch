package Jdbc;

import java.sql.*;

public class JdbcDemo {


    public static void main(String[] args) {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); // Registering driver

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root","143shu");

            Statement statement = connection.createStatement();

            String sql = "select * from worker";

            ResultSet rs = statement.executeQuery(sql);

            while (rs.next()) {

                int id = rs.getInt(1);
                String name = rs.getString(2);
                String address = rs.getString(3);
         System.out.println("id=>"+id+" name=>"+name+" address=>"+address);


            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
