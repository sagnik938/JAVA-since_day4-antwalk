package JDBC_work;
import java.sql.*;

public class JDBCConnect {
    public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/orcl.NRIFINTECH.COM","SYSTEM","Najanaja#28");
			Statement smt=con.createStatement();
			smt.executeUpdate("CREATE TABLE EMP(ENO NUMBER,ENAME VARCHAR(20),ESAL NUMBER)");
     		// boolean out = smt.execute("SELECT * FROM EMPLOYEE");
			// smt.getResultSet();
			System.out.println("Connection");
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
