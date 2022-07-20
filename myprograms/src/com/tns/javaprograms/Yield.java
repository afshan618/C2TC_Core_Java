package com.tns.javaprograms;
class ChildThread extends Thread //thread
{
	public void run()
	{
	for (int i=0;i<10;i++)
	{
		System.out.println("Iam a child thread..");
		Thread.yield();
	
	}
}
//Thread Scheduler
public class Yield {
	public static void main (String[] args) {
		ChildThread t=new ChildThread();
		t.start();
		for (int i=0;i<10;i++)
		{
			System.out.println("...Iam a Main thread...");
	
			
		}
	}
}
}