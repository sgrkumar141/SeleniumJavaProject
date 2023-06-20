package com.Threads.Programs;

/*class ThreadTwo extends Thread
{
	public void run()
	{
		System.out.println("Thread2: " +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread2 is Daemon");
		}
		else
		{
			System.out.println("Thread2 is Not Daemon. Its just a child thread");
		}
		
	}	
}

class ThreadThree extends Thread
{
	public void run() 
	{
		System.out.println("Thread3: " +Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority());
		
		if(Thread.currentThread().isDaemon())
		{
			System.out.println("Thread3 is Daemon");
		}
		else
		{
			System.out.println("Thread3 is Not Daemon. Its just a child thread");
		}
	}
}
*/
public class ThreadDemo implements Runnable // implementing runnable interface
{
	@Override // overriding run method of runnable interface
	public void run()
	{
		//System.out.println("I am Child thread");
		try
		{
			for(int i=1;i<=5;i++)
			{
				Thread.sleep(2000);
				System.out.println(i+"--"+Thread.currentThread().getName());
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		//System.out.println("Thread2 Name: " +Thread.currentThread().getName());
		//System.out.println(Thread.currentThread().getPriority());
		
	}

	public static void main(String[] args) 
	
	{
		//System.out.println("Thread1 Name: " +Thread.currentThread().getName());
		
		//Thread.currentThread().setName("Sagar");
		//System.out.println("New Thread Name: "+Thread.currentThread().getName());
        
		ThreadDemo td = new ThreadDemo(); 
		Thread th1=new Thread(td);         // creating thread 1
		th1.start();
		Thread th2=new Thread(td);
		th2.start();
		/*
		 * System.out.println("Is Thread1 (Main) the Daemon Thread ? : "
		 * +th1.isDaemon()); System.out.println("Thread1 (Main) Alive ? : "
		 * +th1.isAlive()); System.out.println("Default Priority of Thread1 (Main): "
		 * +Thread.currentThread().getPriority());
		 * Thread.currentThread().setPriority(10);
		 */
		/*
		 * System.out.println("Priority of Thread1 (Main) after setting explicitly: "
		 * +Thread.currentThread().getPriority()); ThreadTwo th2=new ThreadTwo(); //
		 * creating thread 2 th2.setDaemon(true); th2.start();
		 * System.out.println("Thread3 Alive ? : " +th2.isAlive());
		 */
		
		
		/*
		 * ThreadThree th3=new ThreadThree(); // Creating thread 3 th3.start();
		 * System.out.println("Thread4 Alive ? : " +th3.isAlive());
		 */
	}

}
