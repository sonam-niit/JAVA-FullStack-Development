package com.simplilearn;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class MyTest {

	Calculator c=null;
	
	@BeforeAll
	static void setUp()
	{
		System.out.println("before All");
	}
	@BeforeEach
	void setCalc()
	{
		c=new Calculator();
		System.out.println("object created");
	}
	@Test
	void testAdd() {
		assertEquals(5, c.add(2, 3));
	}
	@Disabled
	@Test
	void testSub() {
		assertEquals(6, c.sub(9, 3));
	}
	@AfterEach
	void tearDowncalc()
	{
		c=null;
		System.out.println("object deleted");
	}
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("After All");
	}

}
