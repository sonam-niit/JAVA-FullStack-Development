package com.simplilearn.sync;

public class User extends Thread{

	private String name;
	private String msg;
	private Sender sender;
	
	public User(String name,String msg, Sender sender)
	{
		this.name=name;
		this.msg=msg;
		this.sender=sender;
	}
	
	public void run()
	{
		//at a time only one thread can access this sender object
		synchronized (sender) {
			sender.send(name,msg);
		}
		
		
	}
}
