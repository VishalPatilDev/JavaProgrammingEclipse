package com.pac.socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerCode {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(2000);
			Socket receiver = server.accept();
			DataInputStream din = new DataInputStream(receiver.getInputStream());
			System.out.println("Client receives : "+din.readUTF());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
