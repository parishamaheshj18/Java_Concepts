package com.AssignmentPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.SessionPackage.MySQLCreds;

class DBConnection {

	public final static String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	public final static String DB_URL = "jdbc:mysql://localhost:3306/sessions";
	public final static String DB_USERNAME = "root";
	public final static String DB_PASSWORD = MySQLCreds.pwd;

	public static Connection getConnection() throws ClassNotFoundException, SQLException {

		Connection con = null;
		Class.forName(DB_DRIVER_CLASS);
		con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

		System.out.println("DB Connection created successfully");
		return con;
	}
}

public class Assignment14 {

	private static final String CREATE_TABLE_SQL = "CREATE TABLE sessions.userDetails ("
			+ "idNo INT(64) NOT NULL AUTO_INCREMENT UNIQUE," + "userNAME VARCHAR(45) UNIQUE," + "firstNAME VARCHAR(45),"
			+ "lastNAME VARCHAR(45)," + "password VARCHAR(45) ," + "phoneNumber VARCHAR(45) UNIQUE,"
			+ "passportNumber VARCHAR(45) UNIQUE," + "nationality VARCHAR(45) ," + "emergencyNumber VARCHAR(45) ,"
			+ "CommunicationAddress VARCHAR(45) ," + "PermenentAddress VARCHAR(45)," + "College VARCHAR(45) ,"
			+ "Reference VARCHAR(45) ," + "PRIMARY KEY(idNo))";


	public static void insertUser(String usrName, String pwd) {

		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("INSERT INTO userDetails(userName, password) VALUES (?,?);");
			ps.setString(1, usrName);
			ps.setString(2, pwd);
			ps.executeUpdate();
			System.out.println("User Added");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	public static void authenticateUser(String usrName, String pwd) {
		Connection con = null;
		ResultSet rs = null;

		try {
			con = DBConnection.getConnection();
			Statement st = con.createStatement();
	        rs = st.executeQuery("SELECT * FROM userDetails WHERE userName = '" + usrName + "';");
	        if(rs.next()){
	        	System.out.println("User already exists.");
	        }else{
	        	insertUser(usrName, pwd);
				System.out.println("User Authenticated.");
	        } 
			
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// authenticateUser -- this should have two parameters userName, password and
	// this method should check if userName and password are there in the
	// userDetails table

	public static void deleteUser(int userId) {
		Connection con = null;
		PreparedStatement ps = null;

		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("DELETE FROM userDetails WHERE idNo = ?;");
			ps.setInt(1,userId);
			ps.executeUpdate();
			
			System.out.println("User Deleted");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}

	// UpdateUser --
	public static void updateUser(int userId, String usrName, String pwd) {
		Connection con = null;
		PreparedStatement ps=null;
		ResultSet rs = null;
		try {
			con = DBConnection.getConnection();
			ps = con.prepareStatement("UPDATE userDetails SET userName = ?,password = ? WHERE idNo = ?;");
			ps.setString(1, usrName);
			ps.setString(2, pwd);
			ps.setInt(3, userId);
			ps.executeUpdate();
			System.out.println("User Updated");

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	// searchUser --
	public static void searchUser(String phNumber) {
		Connection con = null;
		try {
			con = DBConnection.getConnection();
			String sql = "SELECT * FROM userDetails WHERE phoneNumber LIKE ?;";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, phNumber);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
	            System.out.print(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5));
	         }
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		
		/*try {
			Connection con = DBConnection.getConnection();
			Statement st = con.createStatement();
			st.executeUpdate(CREATE_TABLE_SQL);

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}*/

		authenticateUser("Parisha", "1234");
		authenticateUser("amal", "1234");
		authenticateUser("nayan", "1234");
		authenticateUser("priya", "1234");
		deleteUser(4);
		updateUser(2, "new_Priyank", "new_pwd");
		searchUser("201844");
		
	}

}
