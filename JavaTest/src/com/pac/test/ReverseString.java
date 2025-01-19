package com.pac.test;

public class ReverseString {
	public static void main(String[] args) {
		String str = "One Two Three";
		String[] words = str.split(" ");
		for (int i = words.length - 1; i >= 0; i--){
            System.out.print( words[i] + " ");
		}		
		
		
//		String[] str = {"One","Two","Three"};
//		for (int i=str.length-1;i>=0;i--) {
//			System.out.print(str[i]+" ");
//		}
	}
}
