package com.nt.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.nt.sdp.Printer1;

public class SingletonTest1_DeSerialization {
	public static void main(String[] args) {
		  try {
			  //ReCreate object having data collected from the file using DeSerialization process
			   ObjectInputStream ois=new ObjectInputStream(new FileInputStream("printer_data.ser"));
			   Printer1 p2=(Printer1)ois.readObject();
			    p2.print("hello");
			   System.out.println("p2  hashCode::"+p2.hashCode());
			   ois.close();
			   System.out.println("DeSerlization is done");
		  }
		  catch(IOException ioe) {
			  ioe.printStackTrace();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  System.out.println("--------------------------------------------------------------------------");
		  try {
			  //ReCreate object having data collected from the file using DeSerialization process
			   ObjectInputStream ois=new ObjectInputStream(new FileInputStream("printer_data.ser"));
			   Printer1 p3=(Printer1)ois.readObject();
			    p3.print("hello1");
			   System.out.println("p3  hashCode::"+p3.hashCode());
			   ois.close();
			   System.out.println("DeSerlization is done");
		  }
		  catch(IOException ioe) {
			  ioe.printStackTrace();
		  }
		  catch(Exception e) {
			  e.printStackTrace();
		  }
		  
	  }//main

}
