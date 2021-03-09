package com.nt.test;

public class SingletonTest1_MultiThreaded {

	public static void main(String[] args) {
		//creating thread having Servlet class obj as data
		TicketBookingServlet servlet=new TicketBookingServlet();
		
		Thread t1=new Thread(servlet);
		t1.setPriority(3);
		t1.setName("t1");
		System.out.println(t1.getName()+" "+t1.getPriority()+" : "+t1.getId());
		
		Thread t2=new Thread(servlet);
		t2.setPriority(10);
		t2.setName("t2");
		System.out.println(t2.getName()+" "+t2.getPriority()+" : "+t2.getId());
		
		Thread t3=new Thread(servlet);
		t3.setPriority(1);
		t3.setName("t3");
		System.out.println(t3.getName()+" "+t3.getPriority()+" : "+t3.getId());
		
		t1.start();
		t2.start();
		t3.start();
//		System.out.println("-----------------");
//		servlet.run();
	}

}
