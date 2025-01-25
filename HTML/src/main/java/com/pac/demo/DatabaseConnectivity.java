package com.pac.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


//Persistance layer
//ResultSet should never be the return value of the function
//because result set don't contain data it contain pointer

public class DatabaseConnectivity implements Connectivity {
	public boolean isCardPresent(Card ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
			String query = "select * from carddetails where cardnumber=? ";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getCardnumber());
			ResultSet rs = pstmt.executeQuery();
			return rs.next();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean isValid(Card ref) {
		return isCardPresent(ref);
	}

}
