package com.mphasis.MultipleInheritance;

/**
 * Hello world!
 *
 */

public class DefaultMethods implements PI1,PI2 
{
	// Overriding default show method
	@Override
	public void show(){
		PI1.super.show();
	    PI2.super.show();
	}
	  
	// Declared new Method
	public void showOfPI1() {
	    PI1.super.show(); 
	}
	  
	 // Declared new Method
	 public void showOfPI2() {
	    PI2.super.show(); 
	 }

	 // main Method
	 public static void main(String args[]) {
	        
	    // Instance of Class
		 DefaultMethods d = new DefaultMethods();
	        
	    // Using show Method
	    d.show();
	        
	    // Executing the Methods
	    System.out.println("Now Executing showOfPI1()" + " showOfPI2()");
	    d.showOfPI1();
	    d.showOfPI2();
	 }
}
