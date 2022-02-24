package com.demo.types;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 Nested Test")
@RunWith(JUnitPlatform.class)
public class NestedTest {

	@BeforeAll
	static void beforeAll()
	{
		System.out.println("Before All Test Methods");
	}
	@BeforeEach
	void beforeEach()
	{
		System.out.println("Before Each Test Methods");
	}
	@AfterEach
	void afterEach()
	{
		System.out.println("After Each Test Methods");
	}
	@AfterAll
	static void afterAll()
	{
		System.out.println("after All Test Methods");
	}
	@Nested
	@DisplayName("Test for Inner classes")
	class Inner
	{
		@BeforeEach
		void beforeEach()
		{
			System.out.println("Before Each Test Methods of inner class");
		}
		@AfterEach
		void afterEach()
		{
			System.out.println("After Each Test Methods of Inner class ");
		}
		@Test
		@DisplayName("Test method of inner class")
		void testMethodOfInner()
		{
			System.out.println("Inner class method execution");
		}
		
		@Nested
		@DisplayName("Test for Another Inner classes")
		class AnotherInner
		{
			@BeforeEach
			void beforeEach()
			{
				System.out.println("Before Each Test Methods of inner --> Another Inner class");
			}
			@AfterEach
			void afterEach()
			{
				System.out.println("After Each Test Methods of Inner --> Another Inner class ");
			}
			@Test
			@DisplayName("Test method of inner --> Another Inner class")
			void testMethodOfAnotherInner()
			{
				System.out.println("Another Inner class method execution");
			}
		}
	}
}
