package com.pac.cc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//CoinCollectionManager.java
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CoinCollectionManager {
 private List<Coin> coinCollection;

 public CoinCollectionManager() {
     coinCollection = new ArrayList<>();
     loadFromDatabase();
 }
 
 // CoinCollectionManager.java

public void bulkAddFromFile(String filePath) {
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(","); // Assuming CSV format
            if (parts.length == 5) {
                String country = parts[0].trim();
                double denomination = Double.parseDouble(parts[1].trim());
                int yearOfMinting = Integer.parseInt(parts[2].trim());
                double currentValue = Double.parseDouble(parts[3].trim());
                String acquiredDate = parts[4].trim();

                Coin coin = new Coin(country, denomination, yearOfMinting, currentValue, acquiredDate);
                addCoin(coin); // Adds to the collection and database
            } else {
                System.err.println("Invalid line format: " + line);
            }
        }
        System.out.println("Bulk coins added successfully from file!");
    } catch (IOException e) {
        System.err.println("Error reading bulk coin data from file: " + e.getMessage());
    } catch (NumberFormatException e) {
        System.err.println("Error processing number format: " + e.getMessage());
    }
}


 // Load data from the database
 public void loadFromDatabase() {
     String query = "SELECT country, denomination, year_of_minting, current_value, acquired_date FROM Coins";
     try (Connection connection = DatabaseUtil.getConnection();
          Statement statement = connection.createStatement();
          ResultSet resultSet = statement.executeQuery(query)) {

         while (resultSet.next()) {
             Coin coin = new Coin(
                     resultSet.getString("country"),
                     resultSet.getDouble("denomination"),
                     resultSet.getInt("year_of_minting"),
                     resultSet.getDouble("current_value"),
                     resultSet.getString("acquired_date")
             );
             coinCollection.add(coin);
         }
         System.out.println("Data loaded from the database successfully!");

     } catch (SQLException e) {
         System.err.println("Error loading data from database: " + e.getMessage());
     }
 }

 // Add a new coin to the collection
 public void addCoin(Coin coin) {
     String query = "INSERT INTO Coins (country, denomination, year_of_minting, current_value, acquired_date) VALUES (?, ?, ?, ?, ?)";
     try (Connection connection = DatabaseUtil.getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(query)) {

         preparedStatement.setString(1, coin.getCountry());
         preparedStatement.setDouble(2, coin.getDenomination());
         preparedStatement.setInt(3, coin.getYearOfMinting());
         preparedStatement.setDouble(4, coin.getCurrentValue());
         preparedStatement.setDate(5, Date.valueOf(coin.getAcquiredDate()));

         int rows = preparedStatement.executeUpdate();
         if (rows > 0) {
             coinCollection.add(coin);
             System.out.println("Coin added successfully!");
         }
     } catch (SQLException e) {
         System.err.println("Error adding coin to database: " + e.getMessage());
     }
 }

 // Search coins by country
 public List<Coin> searchByCountry(String country) {
     List<Coin> results = new ArrayList<>();
     String query = "SELECT * FROM Coins WHERE country = ?";
     try (Connection connection = DatabaseUtil.getConnection();
          PreparedStatement preparedStatement = connection.prepareStatement(query)) {

         preparedStatement.setString(1, country);
         ResultSet resultSet = preparedStatement.executeQuery();

         while (resultSet.next()) {
             Coin coin = new Coin(
                     resultSet.getString("country"),
                     resultSet.getDouble("denomination"),
                     resultSet.getInt("year_of_minting"),
                     resultSet.getDouble("current_value"),
                     resultSet.getString("acquired_date")
             );
             results.add(coin);
         }
     } catch (SQLException e) {
         System.err.println("Error searching coins by country: " + e.getMessage());
     }
     return results;
 }

 // Save the current state of the collection to the database
 public void saveToDatabase() {
	    String deleteQuery = "DELETE FROM Coins";
	    try (Connection connection = DatabaseUtil.getConnection();
	         Statement statement = connection.createStatement()) {

//	        statement.executeUpdate(deleteQuery); // Clear existing data

	        // Create a copy of the coin collection to avoid ConcurrentModificationException
	        List<Coin> coinsToSave = new ArrayList<>(coinCollection);

	        // Now, insert the coins from the copied list
	        for (Coin coin : coinsToSave) {
	            addCoin(coin); // Reinsert all coins
	        }
	        System.out.println("Database updated successfully!");

	    } catch (SQLException e) {
	        System.err.println("Error saving data to database: " + e.getMessage());
	    }
	}

 // Get all coins (for display)
 public List<Coin> getAllCoins() {
     return coinCollection;
 }
}
