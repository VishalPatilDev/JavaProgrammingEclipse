package com.pac.test;

import java.util.Scanner;

//public class StringExpander {
//    public static void main(String[] args) {
//    	Scanner sc = new Scanner(System.in);
//        String input = sc.next();
//        String output = sc.next();
//
//        for (int i = 0; i < input.length(); i++) {
//            char ch = input.charAt(i);
//            if (Character.isLetter(ch)) {
//                int count = input.charAt(++i) - '0'; // Convert the next character (digit) to an integer
//                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
//                    count = count * 10 + (input.charAt(++i) - '0'); // Handle two-digit numbers
//                }
//                output += String.valueOf(ch).repeat(count);
//            }
//        }
//
//        System.out.println(output);
//    }
//}


public class StringExpander {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String input = sc.next();
        StringBuilder output = new StringBuilder(); // Use StringBuilder for efficiency

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i); // Get the current character
            if (Character.isLetter(ch)) { // Check if the character is a letter
                int count = input.charAt(++i) - '0'; // Get the next character (digit) as an integer
                
                // Check if the next character is also a digit (handle multi-digit numbers)
                if (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                    count = count * 10 + (input.charAt(++i) - '0'); // Combine digits to form the full number
                }
                
                // Append the character `count` times to the StringBuilder
                output.append(String.valueOf(ch).repeat(count));
            }
        }

        // Convert StringBuilder to String and print the result
        System.out.println(output.toString());
    }
}

