package JDBC_work;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class JDBCInsert {
   public static void main(String[] args) {
    try {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl.NRIFINTECH.COM","SYSTEM","Najanaja#28");
        PreparedStatement psmt = con.prepareStatement("insert into emp values(?,?,?)");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true) {
            try {
                System.out.print("Emp Id: ");
                int eno = Integer.parseInt(br.readLine());
                System.out.print("Name: ");
                String ename = br.readLine();
                System.out.print("Salary: ");
                double esal = Double.parseDouble(br.readLine());
                psmt.setInt(1, eno);
                psmt.setString(2, ename);
                psmt.setDouble(3, esal);
                int count = psmt.executeUpdate();
                if(count>0)System.out.println("record inserted");
                else System.out.println("No record inserted");
                System.out.print("Do you want to insert more records?(Yes/No)  ");
                
                String choice=br.readLine();
                if(choice.equalsIgnoreCase("No") || choice.equalsIgnoreCase("N"))break;
            } catch (NumberFormatException | IOException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Program end...");
    } catch (ClassNotFoundException | SQLException e) {
        e.printStackTrace();
    }
   }

}

