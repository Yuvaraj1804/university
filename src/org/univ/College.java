package org.univ;

public class College extends University {
	public void ug() {
	System.out.println("ug 91% pass");
	}
	public void pg() {
	System.out.println("pg 98% pass");
}
	public static void main(String[] args) {
		College c=new College();
		c.ug();
		c.pg();
		System.out.println("=============");
	
		University u=new University ();
		u.ug();
		u.pg();
		System.out.println("=============");
		
		University un=new  College();
		un.ug();
		un.pg();
	}
}
