package com.pac.cc;

//DatabaseUtil.java
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
 private static final String DB_URL = "jdbc:mysql://localhost:3306/fbs_sql";
 private static final String DB_USER = "root";
 private static final String DB_PASSWORD = "root123";

 public static Connection getConnection() throws SQLException {
     return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
 }
}

