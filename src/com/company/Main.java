package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "steven", "2335ejsm");
            System.out.println(connection);
            Statement statement = connection.createStatement();
            // int result = statement.executeUpdate("insert into account values(1, 'Davis', 'Mike', 60000)");
            // int result = statement.executeUpdate("update account set bal=40000 where accno = 1");
            int result = statement.executeUpdate("delete from account where accno=1");
            System.out.println(result + " rows got deleted");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
