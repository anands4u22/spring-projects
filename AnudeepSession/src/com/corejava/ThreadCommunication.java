package com.corejava;

//wait()
//notify()
//notifyAll()
class Queue
{
	int data;
	boolean flag=false;
	
	synchronized  void  put(int i)
	{
		 while(flag){
		 try {
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 }
		this.data=i;
		this.flag=true;
		System.out.println("put"+i);
		notify();
		
	}
	
	synchronized void get()
	{
		 while(!flag){
		 try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		System.out.println("get"+this.data);
		this.flag=false;
		notify();
	}
}


class Producer extends Thread
{
	Queue q;
	
	public Producer(Queue q)
	{
		this.q=q;
	}
	
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Consumer extends Thread
{
	Queue q;
	
	public Consumer(Queue q)
	{
		this.q=q;
	}
	
	public void run()
	{
		
		while(true)
		{
			q.get();
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

public class ThreadCommunication {
	
	public static void main(String[] args) {
		Queue q=new Queue();
		Thread t1=new Thread(new Producer(q));
		Thread t2=new Thread(new Consumer(q));
		t1.start();
		t2.start();

	}

}
