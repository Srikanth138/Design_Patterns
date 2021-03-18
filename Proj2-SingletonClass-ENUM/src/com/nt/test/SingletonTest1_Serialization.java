package com.nt.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.nt.sdp.Printer1;

public class SingletonTest1_Serialization {
	public static void main(String[] args) {
		try {
			// get Singleton java class object
			Printer1 p1 = Printer1.getInstance();
			Printer1 p2 = Printer1.getInstance();
			// write object data to file using ObjectInputStream support (Serialization
			// process)
			System.out.println(p1.hashCode()==p2.hashCode());
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("printer_data.ser"));
			oos.writeObject(p1);
			oos.flush(); // writes data from buffer to destination
			oos.close();
			System.out.println("SErialization is done");
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// main

}
