package pac.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCUser {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Username : ");
			String username = sc.next();
			System.out.println("Enter Password : ");
			String password = sc.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
			
			String query = "select * from users where username = ? and password = ? ";
			
			PreparedStatement psmt = con.prepareStatement(query);
			
			psmt.setString(1, username);
			psmt.setString(2, password);
			
			ResultSet rs = psmt.executeQuery();
			
			ResultSetMetaData rsmt = rs.getMetaData();
			int columnCount = rsmt.getColumnCount();
			
			
			
			
			
//			while(rs.next()) {
//				for(int i = 1;i<=columnCount;i++) {
//					System.out.println(rs.getString(i)+"\t");
//					
//				}
//				System.out.println();
//			}
			
			if(rs.next()) {
				System.out.println("Valid User");
			}
			else {
				System.out.println("Invalid User");
			}
			
			
		}
		catch(ClassNotFoundException e ) {
			e.printStackTrace();
			
		}
		catch(SQLException e ) {
			e.printStackTrace();
		}

	}

}
