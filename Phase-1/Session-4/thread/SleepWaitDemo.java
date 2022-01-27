package com.simplilearn.thread;

public class SleepWaitDemo {

	
	private static Object LOCK=new Object();
	
	public static void main(String[] args) throws InterruptedException{
		
		Thread.sleep(1000);
		System.out.println("Thread "+Thread.currentThread().getName()+" is woken up after "
				+ "sleeping of 1 sec");
		
		synchronized (LOCK) {
			LOCK.wait(1000);
			
			System.out.println("Object "+LOCK+" is woke up after waiting of 1 second");
		}
		
	}
}
