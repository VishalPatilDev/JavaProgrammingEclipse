package pac.demo.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DatabaseConnectivity {
	public static void main(String[] args) {
		
		try {
			
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter book No : ");
			int bookNo = sc.nextInt();
			System.out.println("Enter Category : ");
			String category = sc.next();
			//Step 1 : Load the driver
			//fully qualified class name is needed ( package + class)
			//for oracle - oracle.jdbc.Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Step 2 : Connect with DB
			//Connection is an interfaces
			//protocol:subprotocol:db-specific information
			//jdbc:mysql/oracle/any database we are connecting with:thin:@<ip>:1521:tns --> for oracle 
			//1521 is the default port number for oracle
			//3306 is the default port number for mysql
			//127.0.0.1 / local host is known as loop back address
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
			
			//Step 3 : Define the query
			
			String query = "select * from books where book_no=? and category=?";//placeholder
			PreparedStatement pstmt=con.prepareStatement(query); //query compile hoke database me store hoga   
			pstmt.setInt(1, bookNo);
			pstmt.setString(2, category);
			ResultSet rs =  pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("valid book");
			}
			else {
				System.out.println("invalid book");
				
			}
			con.close();
			
			//Step 4:hold the query for execution
//			Statement stmt = con.createStatement();
			
//			boolean isResultSet = stmt.execute(query);
//			if(isResultSet) {
//				ResultSet rs = stmt.executeQuery(query);
//				ResultSetMetaData metaData = rs.getMetaData();
//                int columnCount = metaData.getColumnCount();
//				while(rs.next()) {
//					 for (int i = 1; i <= columnCount; i++) {
//	                        System.out.print(rs.getString(i) + "\t");
//	                    }
//	                    System.out.println();
//				}
//				rs.close();
//			}
//			else {
//				System.out.println("other");
//			}
			
			//Step 5:Execute the query 
//			ResultSet rs = stmt.executeQuery(query); //only select query can be executed in executeQuery
			//ResultSet does not contain the actual data
			
			//executeUpdate() for other DML queries 
			//jdbc is by default connected architecture so connection mandatory
			//using rowset we can work without connection
			//disconnected architecture not used.
			
//			String query1 = "insert into books values (110,"sdf","sdf",234,"sfd")";
//			stmt.executeUpdate(query1);
			
			//Step6: Retrieve the data
//			con.close();   Operation not allowed
			//Connection is mandatory for resultset
			//resultset contains pointer to the actual data
			//resultset is a cursor 
//			while(rs.next()) {
//				System.out.println(rs.getString(3));
//			}
//			ResultSetMetaData rsmd = rs.getMetaData(); // for other DML queries
//			System.out.println("Table Name : "+rsmd.getTableName(1));
//			System.out.println("Number of Column :"+rsmd.getColumnCount());
//			
//			con.close();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
