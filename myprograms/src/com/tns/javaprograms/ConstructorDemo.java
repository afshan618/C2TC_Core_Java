package com.tns.javaprograms;

public class ConstructorDemo {
	String name;
	int roll;
	
	
	ConstructorDemo(String name, int roll)
	{
		this.name=name;
		this.roll=roll;

	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConstructorDemo s1=new ConstructorDemo("Afshan",111);
		ConstructorDemo s2= new ConstructorDemo("abc",112);
		 
		
		
		System.out.println(s1.name+" "+s1.roll);
		System.out.println(s2.name+" "+s2.roll);

	}
}
