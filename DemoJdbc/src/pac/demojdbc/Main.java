package pac.demojdbc;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Load the JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish a connection
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fbs_sql", "root", "root123");

            // Step 3: Create a Statement object
            Statement stmt = con.createStatement();

            // Dynamic query (could be SELECT, INSERT, UPDATE, DELETE)
            String query = "SELECT * FROM books"; // Replace this with any query dynamically.

            // Step 4: Execute the query dynamically
            boolean isResultSet = stmt.execute(query);

            if (isResultSet) {
                // Query returned a ResultSet (e.g., SELECT)
                ResultSet rs = stmt.getResultSet();
                ResultSetMetaData metaData = rs.getMetaData();
                int columnCount = metaData.getColumnCount();

                // Print the ResultSet dynamically
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }
                rs.close();
            } else {
                // Query was an update (e.g., INSERT, UPDATE, DELETE)
                int updateCount = stmt.getUpdateCount();
                System.out.println("Query executed successfully. Rows affected: " + updateCount);
            }

            // Step 5: Close the connection
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
