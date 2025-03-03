package com.pac.player;

import java.util.ArrayList;
import java.util.Scanner;

public class PlayerMS {
    static ArrayList<Player> players = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initializePlayers();
        while (true) {
            System.out.println("\n------------------- Player Management System --------------------");
            System.out.println("1. Add Player\n2. Remove Player\n3. Search Player\n4. Update Player Data\n5. Display All Players\n6. Display Top Players\n7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> addPlayer();
                case 2 -> removePlayer();
                case 3 -> searchPlayer();
                case 4 -> updatePlayer();
                case 5 -> displayAllPlayers();
                case 6 -> displayTopPlayers();
                case 7 -> {
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    static void initializePlayers() {
        players.add(new Player(18, "Virat Kohli", 4000, 5, 100));
        players.add(new Player(93, "Bumrah", 1000, 150, 40));
        players.add(new Player(7, "MS Dhoni", 2000, 10, 70));
        players.add(new Player(45, "Rohit Sharma", 3800, 5, 110));
        players.add(new Player(33, "Hardik Pandya", 2200, 60, 100));
        players.add(new Player(63, "Suryakumar Yadav", 2100, 4, 70));
        players.add(new Player(1, "KL Rahul", 3200, 3, 80));
        players.add(new Player(13, "Virat Mohli", 3000, 5, 40));
    }

    static void addPlayer() {
        System.out.print("Enter Jersey Number: ");
        int jerseyNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Player Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Runs: ");
        int runs = sc.nextInt();
        System.out.print("Enter Matches Played: ");
        int matchesPlayed = sc.nextInt();
        System.out.print("Enter Wickets: ");
        int wickets = sc.nextInt();
        players.add(new Player(jerseyNumber, name, runs, matchesPlayed, wickets));
        System.out.println("Player added successfully!");
    }

    static void removePlayer() {
        System.out.print("Enter Jersey Number of player to remove: ");
        int jerseyNumber = sc.nextInt();
        players.removeIf(player -> player.jerseyNumber == jerseyNumber);
        System.out.println("Player removed successfully!");
    }

    static void searchPlayer() {
        System.out.println("Search by (1) Jersey Number (2) Player Name: ");
        int choice = sc.nextInt();
        sc.nextLine();
        if (choice == 1) {
            System.out.print("Enter Jersey Number: ");
            int jerseyNumber = sc.nextInt();
            for (Player player : players) {
                if (player.jerseyNumber == jerseyNumber) {
                    displayPlayer(player);
                    return;
                }
            }
        } else if (choice == 2) {
            System.out.print("Enter Player Name: ");
            String name = sc.nextLine();
            for (Player player : players) {
                if (player.name.equalsIgnoreCase(name)) {
                    displayPlayer(player);
                    return;
                }
            }
        }
        System.out.println("Player not found!");
    }

    static void updatePlayer() {
        System.out.print("Enter Jersey Number of player to update: ");
        int jerseyNumber = sc.nextInt();
        for (Player player : players) {
            if (player.jerseyNumber == jerseyNumber) {
                System.out.print("Enter choice (1) Runs (2) Wickets (3) Matches: ");
                int choice = sc.nextInt();
                if (choice == 1) {
                    System.out.print("Enter new Runs: ");
                    player.runs = sc.nextInt();
                } else if (choice == 2) {
                    System.out.print("Enter new Wickets: ");
                    player.wickets = sc.nextInt();
                } else if (choice == 3) {
                    System.out.print("Enter new Matches Played: ");
                    player.matchesPlayed = sc.nextInt();
                }
                System.out.println("Player data updated successfully!");
                return;
            }
        }
        System.out.println("Player not found!");
    }

    static void displayAllPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players available.");
            return;
        }
        System.out.printf("%-13s %-30s %-5s %-7s %-7s%n", "Jersey Number", "Name", "Runs", "Wickets", "Matches");
        for (Player player : players) {
            System.out.printf("%-13d %-30s %-5d %-7d %-7d%n", player.jerseyNumber, player.name, player.runs, player.wickets, player.matchesPlayed);
        }
    }

    static void displayTopPlayers() {
        System.out.println("(1) Top Runs (2) Top Wickets: ");
        int choice = sc.nextInt();
        if (choice == 1) {
            players.stream().sorted((a, b) -> b.runs - a.runs).limit(3).forEach(p -> System.out.println(p.name + " with runs: " + p.runs));
        } else if (choice == 2) {
            players.stream().sorted((a, b) -> b.wickets - a.wickets).limit(3).forEach(p -> System.out.println(p.name + " with wickets: " + p.wickets));
        } else {
            System.out.println("Invalid choice!");
        }
    }

    static void displayPlayer(Player player) {
        System.out.printf("Jersey Number: %d, Name: %s, Runs: %d, Wickets: %d, Matches: %d%n",
                player.jerseyNumber, player.name, player.runs, player.wickets, player.matchesPlayed);
    }
}

