package com.pac.cc;

import java.util.Scanner;

//Main.java
import java.util.List;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
     CoinCollectionManager manager = new CoinCollectionManager();
     Scanner scanner = new Scanner(System.in);

     while (true) {
         System.out.println("\n--- Coin Collection Manager ---");
         System.out.println("1. Add a Coin");
         System.out.println("2. Search Coins by Country");
         System.out.println("3. Display All Coins");
         System.out.println("4. Bulk add coins from file");
         System.out.println("5. Delete Coin");
         System.out.println("6. Update Coin");
         System.out.println("7. Save to Database");
         System.out.println("8. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine();

         switch (choice) {
             case 1:
                 System.out.print("Enter Country: ");
                 String country = scanner.nextLine();
                 System.out.print("Enter Denomination: ");
                 double denomination = scanner.nextDouble();
                 System.out.print("Enter Year of Minting: ");
                 int year = scanner.nextInt();
                 System.out.print("Enter Current Value: ");
                 double value = scanner.nextDouble();
                 scanner.nextLine(); // Consume newline
                 System.out.print("Enter Acquired Date (YYYY-MM-DD): ");
                 String date = scanner.nextLine();

                 Coin coin = new Coin(country, denomination, year, value, date);
                 manager.addCoin(coin);
                 break;

             case 2:
                 System.out.print("Enter Country to Search: ");
                 String searchCountry = scanner.nextLine();
                 List<Coin> results = manager.searchByCountry(searchCountry);
//                 results.forEach(System.out::println);
                 
                 for(Coin r : results) {
                	 System.out.println(r);
                 }
//                 System.out.println(results);
                 break;

             case 3:
                 List<Coin> allCoins = manager.getAllCoins();
////                 allCoins.forEach(System.out::println);
//                 for(Coin ac : allCoins) {
//                	 System.out.println(ac);
//                 }
//                 break;
                 if(allCoins.isEmpty()) {
                 	System.out.println("The Table is Empty!");
                 	break;
                 }
                 else {
                	 manager.displayAllCoinsInTable();
                	 break;
                 }
            	 
                 
             case 4:
            	    System.out.print("Enter file path for bulk upload: ");
            	    String filePath = scanner.nextLine();
            	    manager.bulkAddFromFile(filePath);
            	    break;
            	    
             case 5:
                 System.out.print("Enter country of coin to delete: ");
                 String deleteCountry = scanner.nextLine();
                 manager.deleteCoinByCountry(deleteCountry);
                 break;

             case 6:
                 System.out.print("Enter country of coin to update: ");
                 String updateCountry = scanner.nextLine();
                 System.out.print("Enter new Denomination: ");
                 double newDenomination = scanner.nextDouble();
                 System.out.print("Enter new Year of Minting: ");
                 int newYear = scanner.nextInt();
                 System.out.print("Enter new Current Value: ");
                 double newValue = scanner.nextDouble();
                 scanner.nextLine(); // Consume newline
                 System.out.print("Enter new Acquired Date (YYYY-MM-DD): ");
                 String newDate = scanner.nextLine();

                 Coin updatedCoin = new Coin(updateCountry, newDenomination, newYear, newValue, newDate);
                 manager.updateCoin(updateCountry, updatedCoin);
                 break;

             case 7:
                 manager.saveToDatabase();
                 break;

             case 8:
                 System.out.println("Exiting the application.");
                 System.exit(0);
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }
}
