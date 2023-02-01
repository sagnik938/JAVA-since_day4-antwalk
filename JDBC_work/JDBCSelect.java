package JDBC_work;

import java.sql.*;

public class JDBCSelect {
    public static void main(String[] args) {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl.NRIFINTECH.COM", "SYSTEM",
                    "Najanaja#28");
            Statement smt = con.createStatement();
            ResultSet rs = smt.executeQuery("SELECT * FROM EMP");
            while (rs.next()) {
                System.out.println(
                        "eNo: " + rs.getInt(1) + "\nName: " + rs.getString(2) + "\nSalary: " + rs.getDouble(3));
            }

            System.out.println("Program end...");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
