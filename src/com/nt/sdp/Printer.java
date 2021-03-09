package com.nt.sdp;

/* 1. if u create object for sub class of abstract class. then abstract class constructor executes. but it does not mean object is create for abstract class
 * 2. if u create object by using cloning process or deserialization process then no constructor will execute. but it does not mean object is not created there. */
public class Printer {

	// Creating singleton java with eager instantiatin(Creating object during class
	// loading even though no one has asked for object creation)is bad practice.
	// it will waste the memory and CPU time if then early created object for
	// singleton is not used ever.
//	private static Printer Instance=new Printer(); //eager Instantiation
	private static Printer Instance;

	// private Constructor
	private Printer() {
		System.out.println("Printer.Printer() 0-ParamConstructor");
	}

	/*
	 * // static factory method public static Printer getInstance() {
	 * 
	 * // singleton logic if(Instance==null) { Instance=new Printer(); } return
	 * Instance; }
	 */
	/**
	 * problem for singleton java class in multi-thread environment:- if multiple
	 * threads are acting one object simultaneously or Concurrently then the data of
	 * the object by distrub. then makes object as non-thread safe object. NOTE:-
	 * every servlet comp is Single instance(Object) and multi-thread comp
	 */

	// static factory method as snchronized method
	synchronized public static Printer getInstance() {

		// singleton logic
		if (Instance == null) {
			Instance = new Printer();
		}
		return Instance;
	}

	// Business logic
	public void print(String msg) {
		System.out.println(msg);
	}

//	synchronized(this){  }
}
/**
 * Thre are 3 solutions this problem 1.By enable eage instantiation on singleton
 * class(Bad) 2.By taking static factory method as snchronized method (little
 * bad) 3. by taking synchronized blocks inside static method (good solution)
 * 
 */