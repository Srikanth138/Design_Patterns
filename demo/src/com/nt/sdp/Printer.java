package com.nt.sdp;

import com.nt.commons.CommonsUtil;

/* 1. if u create object for sub class of abstract class. then abstract class constructor executes. but it does not mean object is create for abstract class
 * 2. if u create object by using cloning process or deserialization process then no constructor will execute. but it does not mean object is not created there. */
public class Printer extends CommonsUtil {

	// Creating singleton java with eager instantiatin(Creating object during class
	// loading even though no one has asked for object creation)is bad practice.
	// it will waste the memory and CPU time if then early created object for
	// singleton is not used ever.
//	private static Printer Instance = new Printer(); // eager Instantiation
//	private static  Printer Instance; //create more objects
//	private static volatile Printer Instance; //create only one object but every time changing the values. and violate is thread safe

	// private Constructor
	private Printer() {
		System.out.println("Printer.Printer() 0-ParamConstructor");
	}

	// static factory method
	/*public static Printer getInstance() {

		// singleton logic
		if (Instance == null) {
			Instance = new Printer();
		}
		return Instance;
	}*/

	/**
	 * problem for singleton java class in multi-thread environment:- if multiple
	 * threads are acting one object simultaneously or Concurrently then the data of
	 * the object by distrub. then makes object as non-thread safe object. NOTE:-
	 * every servlet comp is Single instance(Object) and multi-thread comp
	 * 
	 */

// static factory method as snchronized method
	/*
	 * synchronized public static Printer getInstance() {
	 * 
	 * // singleton logic if (Instance == null) { Instance = new Printer(); } return
	 * Instance; }
	 */

	/*
	 * public static Printer getInstance() throws InterruptedException { // static
	 * is not work this keyword.this is used only object level // static level we
	 * can use the ClassName.class if (Instance == null) {//1st NULL check
	 * synchronized (Printer.class) { // singleton logic if (Instance == null)
	 * {//2nd NULL check //but it is not required in my own think Instance = new
	 * Printer(); Thread.sleep(3000); //here we are find the difference the
	 * singleton thread creation } } } return Instance; }
	 */

	
	/*solution 2:: Eager Instantiation on singleton class using nested inner class having volatile behavior(overall singleton java class is instantiated lazily only when static factory method is called by client) */
	//Best solution
	private static class InnerPrinter {
		private static volatile Printer Instance=new Printer();
	}
	
	//facory method
	public static Printer getInstance() {
		return InnerPrinter.Instance;
	}
	
	
	
	//To  Stop Cloning
		@Override
		public  Object clone()throws CloneNotSupportedException  {
			throw new CloneNotSupportedException("Cloning not allowed in Singleton Printer classs");
			//return InnerPrinter.INSTANCE;
		}
		
		//To Stop DeSerialization
		private static  final long serialVersionUID=5354353L;
		public  Object readResolve() {
			return InnerPrinter.Instance;
			//throw  new  IllegalArgumentException("Derailziation is not allowed on singleton class");
		}
		
		/*	@Override
			public String toString() {
				return super.toString();
			}*/
		public String hello() {
			return "hello";
		}

	// Business logic
	public void print(String msg) {
		System.out.println(msg);
	}
}
/**
 * Thre are 3 solutions this problem 1.By enable eage instantiation on singleton
 * class(Bad) 2.By taking static factory method as snchronized method (little
 * bad) 3. by taking synchronized blocks inside static method (good solution)
 * 
 * //the Beast solution is the NestedClass
 */