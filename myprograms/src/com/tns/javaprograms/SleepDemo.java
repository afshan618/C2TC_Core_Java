package com.tns.javaprograms;
class Akash extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Akash Thread");
			try
			{
				Thread.sleep(3000);
			}
		
			catch(InterruptedException e) {
			}
		}
			} }
public class SleepDemo {

	public static void main(String[] args) throws InterruptedException{
	Akash a=new Akash();
	a.start();
	a.join();
	for(int i=0;i<10;i++)
	{
		System.out.println("Amol Thread");
		
	}

}
}
