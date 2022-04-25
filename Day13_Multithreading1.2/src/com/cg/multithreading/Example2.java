package com.cg.multithreading;
class Parent1 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(10000);
			System.out.println("C2TC Program");
		}
		catch (InterruptedException e)
		{
			System.out.println("Exception occurred");
		}
	}
}

public class Example2 {

	public static void main(String[] args)
	{
		Parent1 p=new Parent1();
		p.start();
		p.interrupt();
	}

}
