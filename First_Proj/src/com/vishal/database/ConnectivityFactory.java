package com.vishal.database;

import java.io.FileInputStream;
import java.util.Scanner;

public class ConnectivityFactory {
	public static Database getObject() {
		FileInputStream fin = new FileInputStream("class.txt");
		Scanner sc = new Scanner(fin);
		String className = sc.nextLine();
		Class meta = Class.forName(className);
		Database ref = ();
	}

}
