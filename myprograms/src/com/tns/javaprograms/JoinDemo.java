package com.tns.javaprograms;
class Adarsh extends Thread{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Adarsh Thread");
		}
	}
}
public class JoinDemo {
	public static void main(String[]args) {
		Adarsh a=new Adarsh();
		a.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Amol Thread");
		}
	}

}
