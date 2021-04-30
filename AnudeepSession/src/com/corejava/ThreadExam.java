package com.corejava;

class ThreadFirst extends Thread
{
	boolean flag=true;
	
	public void terminate()
	{
		this.flag=false;
	}
	public void run()
	{
		while(flag)
		{
			System.out.println("Running");
		}
	}
	
	
}

public class ThreadExam {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println(Thread.currentThread().getName());
		ThreadFirst obj=new ThreadFirst();
		Thread t1=new Thread(obj,"My Thread");
		System.out.println(t1.getState());
		
		t1.start();
		Thread.sleep(2000);
		obj.terminate();
		
		
	}

}
