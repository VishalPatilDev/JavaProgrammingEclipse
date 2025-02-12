package com.pac.ccw;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DatabaseConnectivity implements Connectivity {
	public boolean isCardPresent(Coin ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
			String query = "select * from coins where country=? and denomination=? and year_of_minting=? and current_value=? and acquired_date=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getCountry());
			pstmt.setString(2, ref.getDenomination());
			pstmt.setString(3, ref.getYearOfMinting());
			pstmt.setString(4, ref.getCurrentValue());
			pstmt.setString(5, ref.getAcquiredDate());
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
	public boolean isValid(Coin ref) {
		return isCardPresent(ref);
		
		
	}

	
}
