package com.pac.stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStram {

	public static void main(String[] args) {
		try {
			FileInputStream fin = new FileInputStream("Player.txt");
			BufferedInputStream bin = new BufferedInputStream(fin);
			System.out.println(bin.read());
			bin.close();
			fin.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
