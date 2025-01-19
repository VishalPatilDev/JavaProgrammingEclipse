package com.pac.test;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();

 
        if (isAnagram(str1, str2)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[26];
        for (int i = 0; i < str1.length(); i++) {
            charCount[str1.charAt(i) - 'a']++;
            charCount[str2.charAt(i) - 'a']--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
        
//        char[] charArray1 = str1.toCharArray();
//        char[] charArray2 = str2.toCharArray();
//        Arrays.sort(charArray1);
//        Arrays.sort(charArray2);

//        return Arrays.equals(charArray1, charArray2);
    }
}

