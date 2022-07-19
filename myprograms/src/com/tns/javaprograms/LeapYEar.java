package com.tns.javaprograms;
import java.util.Scanner;
public class LeapYEar {

	public static void main(java.lang.String[] args) {
      int year;
      System.out.println("Enter an Year :: ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("Specified year is a leap year");
      else
         System.out.println("Specified year is not a leap year");
   }
}
