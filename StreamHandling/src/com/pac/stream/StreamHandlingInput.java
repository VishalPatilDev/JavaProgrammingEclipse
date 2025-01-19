package com.pac.stream;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class StreamHandlingInput {
// Conversion of a byte stream into an object is called Deserialization
// Deserialization is the reverse process of serialization
// The file `Player.txt` contains the serialized object of the Player class
// This program reads the serialized data and converts it back into a Player object

    public static void main(String[] args) {
        try {
            // Step 1: Open the file `Player.txt` for reading
            // `FileInputStream` reads raw bytes from the file
            FileInputStream fin = new FileInputStream("Player.txt");

            // Step 2: Wrap `FileInputStream` with `BufferedInputStream`
            // BufferedInputStream improves performance by reading chunks of data into a buffer (default size: 4KB)
            BufferedInputStream bin = new BufferedInputStream(fin);

            // Step 3: Wrap `BufferedInputStream` with `ObjectInputStream`
            // `ObjectInputStream` is used to deserialize objects from a byte stream
            ObjectInputStream oin = new ObjectInputStream(bin);

            // Step 4: Read the serialized object from the file
            // The serialized object is read as a generic Object and cast to the Player class
            Player p1 = (Player) oin.readObject(); // Casting the object back to `Player`
            System.out.println(p1);
            
            // Step 5: Print the deserialized object details
            System.out.println("Player Details:");
            System.out.println("ID: " + p1.getPlayerId());     // Printing the ID of the player
            System.out.println("Name: " + p1.getPlayerNmae()); // Printing the name of the player
            System.out.println("Age: " + p1.getJersey());   // Printing the age of the player

            // Step 6: Close all the streams
            // Closing `oin` ensures that all underlying streams are also closed
            oin.close();
            bin.close();
            fin.close();

        } catch (ClassNotFoundException e) {
            // This exception is thrown if the class definition for the serialized object is not found
            e.printStackTrace();
        } catch (IOException e) {
            // This exception is thrown for general input/output errors (e.g., file not found, issues reading data)
            e.printStackTrace();
        }
    }
}

