package pac.demo.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseConnectivity implements Connectivity {
	public boolean isCardPresent(User ref) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fbs_sql","root","root123");
			String query = "select * from userauth where username=? and password=?";
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setString(1, ref.getUserName());
			pstmt.setString(2, ref.getPassword());
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
	public boolean isValid(User ref) {
		return isCardPresent(ref);
	}

}

