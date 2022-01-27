package com.simplilearn.thread;

public class MainThread implements Runnable{

	//public int count=0;
	
	public MainThread() {
		
	}
	@Override
	public void run() {
		int count=0;
		while(count<=10)
		{
			System.out.println("Exc Thread "+ (++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Starting Main thread...");
		
		MainThread main=new MainThread();
		Thread m=new Thread(main);
		m.start();
		int count=0;
		while(count<=10)
		{
			System.out.println("Main Thread "+ (++count));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}
