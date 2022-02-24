package com.demo.types;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import com.simplilearn.TypesJUnitTest.Calculator;

@DisplayName("JUnit 5 Nested Test")
@RunWith(JUnitPlatform.class)
public class RepeatedClass {

	Calculator calc=null;
	@BeforeAll
	static void setUpAll()
	{
		System.out.println("Before All Test Methods");
	}
	@BeforeEach
	void setUp()
	{
		calc= new Calculator();
		System.out.println("object created");
	}
	@AfterEach
	void tearDown()
	{
		calc=null;
		System.out.println("object destroyed");
	}
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("after All Test Methods");
	}
	@Test
	@DisplayName("Add Operation Test")
	@RepeatedTest(5)
	void addNumbers()
	{
		assertEquals(5, calc.add(2, 3));
		System.out.println("Test case Executed");
	}
}
