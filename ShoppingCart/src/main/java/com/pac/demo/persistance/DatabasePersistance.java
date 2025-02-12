package com.pac.demo.persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.pac.demo.dataaccess.CartAccess;
import com.pac.demo.entity.Product;

public class DatabasePersistance implements CartAccess{
	

	@Override
	public boolean storedProducts(List<Product> cart) {
		boolean is = true;
		try {
			
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
		String query = "INSERT INTO cart (id, quantity) VALUES (?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		for (Product product : cart) {
            pstmt.setInt(1, product.getId());
            pstmt.setInt(2, product.getQty());
            int ra=pstmt.executeUpdate();
            if(ra==0) {
            	is=false;
            }
        }
		
//		ResultSet rs = pstmt.executeQuery();
//		return rs.next();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return is;
		
		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
//			String query = "select * from cart where id=? and quantity=?";
//			PreparedStatement pstmt = con.prepareStatement(query);
//			for (Product product : cart) {
//                pstmt.setInt(1, product.getId());
//                pstmt.setInt(2, product.getQty());
//            }
//			ResultSet rs = pstmt.executeQuery();
//			return rs.next();
//		} catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return false;
	
	}
	

}
