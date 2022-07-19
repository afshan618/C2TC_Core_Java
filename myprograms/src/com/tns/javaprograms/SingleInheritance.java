package com.tns.javaprograms;
class A {
	void display() {
		System.out.println("Display call");
	}
}
class B extends A{
	void show() {
		System.out.println("Show method call");
	}
}
	
public class SingleInheritance {
public static void main(String[] args) {
	B ob=new B();
	ob.display();
	ob.show();
}
}
