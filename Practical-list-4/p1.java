class MyThread extends Thread
{
	public void run ()
	{
		for(int i=0;i<5;i++)
		{
		System.out.println("Hello World");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.print("Error"+e.getMessage());
		}
	}}
}

class MyThread2 extends Thread
{
	public void run ()
	{
		for(int i=0;i<5;i++)
	{
		System.out.println("Hello World 2");
		try
		{
			Thread.sleep(500);
		}
		catch(Exception e)
		{
			System.out.print("Error"+e.getMessage());
		}
	}}
}


public class p1 {
	public static void main(String args[])
	{
	MyThread t1 = new MyThread();
	
		t1.start();
	
		try
		{
			Thread.sleep(5);
		}
		catch(Exception e)
		{
			System.out.print("Error"+e.getMessage());
		}
	MyThread2 t2 = new MyThread2();
	
		t2.start();
	
	}
}
