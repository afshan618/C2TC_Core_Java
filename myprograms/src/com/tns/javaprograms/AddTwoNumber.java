package com.tns.javaprograms;
import java.util.Scanner;
public class AddTwoNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		System.out.println("eneter the first number ");
		int number1 = reader.nextInt();
		
		System.out.println("eneter the second number ");
		int number2 = reader.nextInt();
		
		int total=number1 + number2;
		System.out.println("total value is: "+total);
		

	}

}
