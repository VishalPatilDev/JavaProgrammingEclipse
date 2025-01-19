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
         System.out.println("4. Bulf add coins from file");
         System.out.println("5. Save to Database");
         System.out.println("6. Exit");
         System.out.print("Enter your choice: ");
         int choice = scanner.nextInt();
         scanner.nextLine(); // Consume newline

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
                 results.forEach(System.out::println);
                 break;

             case 3:
                 List<Coin> allCoins = manager.getAllCoins();
                 allCoins.forEach(System.out::println);
                 break;
                 
             case 4:
            	    System.out.print("Enter file path for bulk upload: ");
            	    String filePath = scanner.nextLine();
            	    manager.bulkAddFromFile(filePath);
            	    break;

             case 5:
                 manager.saveToDatabase();
                 break;

             case 6:
                 System.out.println("Exiting the application.");
                 System.exit(0);
                 break;

             default:
                 System.out.println("Invalid choice. Try again.");
         }
     }
 }
}
