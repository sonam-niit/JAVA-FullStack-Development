package  com.simplilearn.TestDemoJunit5;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.Suite;
import org.junit.runner.RunWith;

@DisplayName("JUnit 5 test Cases")
@RunWith(JUnitPlatform.class)
public class StandardTestClass {

	@BeforeAll
	static void initAll()
	{
		System.out.println("Before all");
	}
	@BeforeEach
	void init()
	{
		System.out.println("Before Each test");
	}
	@Test
	void myTest()
	{
		System.out.println("Test case executed");
	}
	@Test
	void failingTest()
	{
		System.out.println("failing Test");
	}
	@AfterEach
	void tearDown()
	{
		System.out.println("After Each test");
	}
	@AfterAll
	static void tearDownAll()
	{
		System.out.println("After All");
	}
}
