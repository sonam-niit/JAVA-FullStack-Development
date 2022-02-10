package com.simplilearn.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Main {

	public static void main(String[] args) {
		
		StandardServiceRegistry registery= 
				new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata metadata= new MetadataSources(registery).getMetadataBuilder().build();
		
		SessionFactory factory= metadata.getSessionFactoryBuilder().build();
		
		Session session= factory.openSession();
		
		Student s1= new Student("Anurag","Patel","anu@gmail.com","anurag@123");
		Transaction t= session.beginTransaction();
		session.save(s1);
		t.commit();
		System.out.println("Data Inserted");
		
		session.close();
		factory.close();
	}
}
