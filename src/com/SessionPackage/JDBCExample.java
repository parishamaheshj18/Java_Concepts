package com.SessionPackage;
import java.sql.*;


public class JDBCExample {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sessions","root", MySQLCreds.pwd);
			System.out.println("Database connection established");
			Statement st = con.createStatement();
			/*ResultSet rs = st.executeQuery("SELECT * FROM table1");
			while(rs.next()) {
				System.out.println(rs.getInt(1) +" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
			}*/
			int rs2 = st.executeUpdate("INSERT INTO table1(Name, Surname, RollNo) VALUES ('Amal', 'varma', '106')");
			
			System.out.println(rs2);
			st.executeUpdate("DELETE FROM table1 WHERE ID=2");
			st.executeUpdate("UPDATE table1 SET Name = 'Pankaj' WHERE Id = 1");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
}
	
