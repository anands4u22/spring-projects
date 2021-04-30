package com.corejava;


class Resource
{
	volatile int flag=1;
}

class Thread1 extends Thread
{
	Resource r;
	
	Thread1(Resource r)
	{
		this.r=r;
	}
	
	public void run()
	{
		synchronized(r){
		while(true){
		
		while (r.flag!=1){
			try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("In Thread1");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		r.flag=2;
		r.notifyAll();
		
	}
	}
	}
	
}
class Thread2 extends Thread
{
	Resource r;
	
	Thread2(Resource r)
	{
		this.r=r;
	}
	
	public void run()
	{ synchronized(r){
		while(true){
		
		while (r.flag!=2){
			try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("In Thread2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			
			}
			r.flag=3;
			r.notifyAll();
		}
	}
	}
	
}
class Thread3 extends Thread
{
	Resource r;
	
	Thread3(Resource r)
	{
		this.r=r;
	}
	
	public void run()
	{
		synchronized(r){ 
		while(true){
		
		while (r.flag!=3){
			try {
				r.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			System.out.println("In Thread3");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			r.flag=1;
			r.notifyAll();
			}
		}
	}
	
}

public class MutliThreadCommunication {

	
	public static void main(String[] args) {
		Resource r=new Resource();
		Thread1 t1=new Thread1(r);
		Thread2 t2=new Thread2(r);
		Thread3 t3=new Thread3(r);
		t1.start();
		t2.start();
		t3.start();

	}

}
