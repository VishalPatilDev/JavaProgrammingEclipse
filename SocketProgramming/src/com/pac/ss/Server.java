package com.pac.ss;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		ServerSocket ss = new ServerSocket(2000);
		Socket client_s = ss.accept();
		DataInputStream din = new DataInputStream(client_s.getInputStream());
		System.out.println(din.readUTF());
		din.close();

	}

}
