package com.corejava;

class Print{
	
	 void printDetails()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName()+"   "+i);
		}
	}
}

class AThread extends Thread{
	Print p;
	
	AThread(Print p)
	{
		this.p=p;
	}
	
	public void run()
	{
		synchronized(p){
		p.printDetails();
		}
	}
}

class BThread extends Thread{
	Print p;
	
	BThread(Print p)
	{
		this.p=p;
	}
	
	public void run()
	{
		synchronized(p){
		p.printDetails();
		}
	}
}

public class MultiThreadExam {

	public static void main(String[] args) {
		Print p=new Print();
		
		Thread t1=new Thread(new AThread(p),"Thread A");
		Thread t2=new Thread(new BThread(p),"Thread B");
		Thread t3=new Thread(new BThread(p),"Thread B1");
		t1.start();
		//synchronized gives a lock on the particular block for each thread
		//synchronized ensures that only once thread access the method at any given point of time
		t2.start();
		t3.start();
	}

}
