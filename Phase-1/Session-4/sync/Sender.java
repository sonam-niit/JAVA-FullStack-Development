package com.simplilearn.sync;

public class Sender {

	public void send(String name,String msg)
	{
		System.out.println(name+ " is Sending "+msg);
		try {
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("message sent successfully");
	}
}
