package com.mphasis.EmployeeFirst;

/**
 * Hello world!
 *
 */
public class Employee1 
{
	int id;
	String name;
	double salary;
	public Employee1(int id, String nm, double sal) {
		this.id=id;
		this.name=nm;
		this.salary=sal;
	}
	public void increement() {
		double incr=this.salary+(0.1*this.salary);
		System.out.println("Salary after increement is "+incr);
	}
	public String toString() {
		return getClass()+"\nEmployee ID is:="+id+" "+"\nEmployee Name is:="+name;
	}
    public static void main( String[] args )
    {
       Employee1 e1=new Employee1(101,"Rohit",25000);
       //System.out.println(e1.toString());
       System.out.println(e1);
       e1.increement();
    }
}
