package com.pac.ss;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket s = new Socket(InetAddress.getLocalHost(),2000);
		String str = "Hello Server";
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		dout.writeUTF(str);
		dout.close();
	}
}
