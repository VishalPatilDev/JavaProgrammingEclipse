package com.pac.stream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StreamHandling {
//Conversion of an object into byte stream is called Serialization
	//The process of converting a byte stream into an object is De-serialization.
	//when we do player implements Serializable
	//JVM will provide a bit to the first bit of the player //marking
	//mark for some special treatment
	public static void main(String[] args) {
		try {
			String dataToStore = "This needs to go into the file without converting into byte[]";
//			FileOutputStream fout = new FileOutputStream("data.txt",true);//Second parameter is known as append flag . by defaults false
			FileOutputStream fout = new FileOutputStream("Player.txt");
			//fout needs byte array
			//every time writing into files means making physical contact with file every time 
			//so
			BufferedOutputStream bout = new BufferedOutputStream(fout);
			//it'll not directly go to file but first into the buffer
			//it'll hold into the memory different space for buffer
			//default size of buffer is 4kb
			//there can be 3 ways to write into the file through buffer
			//1.when buffer get fulls it'll go the proper destination(file)
			//2.programmer can explicitly flush buffer
			//3.when you close the buffer the pending data will go to the destination
			
			ObjectOutputStream oout  =new ObjectOutputStream(bout);
//			DataOutputStream dout = new DataOutputStream(bout); //dout will convert anything into byte array
//			dout.writeUTF(dataToStore); //Universal Text Format //Uni-code
			
			
			Player p1 = new Player(1,"H. Kaur",30);
			oout.writeObject(p1);
			
			
//			byte[] data = dataToStore.getBytes();
//			fout.write(data);
			
			
			bout.close();
			fout.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
