package com.pac.socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientCode {

	public static void main(String[] args) {
		try {
			Socket sender = new Socket(InetAddress.getByName("localhost"),2000);
			String s = "Hello from Client";
			DataOutputStream dout = new DataOutputStream(sender.getOutputStream());
			dout.writeUTF(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
